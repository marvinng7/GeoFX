package controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.concurrent.ExecutionException;
import ipapi.*;
import ipify.*;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.concurrent.Task;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.fxml.Initializable;

public class Controller implements Initializable{
	
	IpifyService ipifyService = new IpifyService();
	IpapiService ipapiService = new IpapiService();
	StringProperty ip = new SimpleStringProperty();

	@FXML
    private Label LabelPotential;

    @FXML
    private Button buttonIP;

    @FXML
    private CheckBox checkCrawler;

    @FXML
    private CheckBox checkProxy;

    @FXML
    private CheckBox checkTor;

    @FXML
    private ImageView imageBandera;

    @FXML
    private Label labelASN;

    @FXML
    private Label labelCalling;

    @FXML
    private Label labelCity;

    @FXML
    private Label labelCurrency;

    @FXML
    private Label labelHost;

    @FXML
    private Label labelISP;

    @FXML
    private Label labelLanguage;

    @FXML
    private Label labelLatitude;

    @FXML
    private Label labelLevel;

    @FXML
    private Label labelLocation;

    @FXML
    private Label labelLongitude;

    @FXML
    private Label labelP;

    @FXML
    private Label labelSecure;

    @FXML
    private Label labelType;

    @FXML
    private Label labelZIP;

    @FXML
    private Label labelZone;

    @FXML
    private AnchorPane view;

    @FXML
    private TextField textIP;

    
    public AnchorPane getView() {
		return view;
	}
    @FXML
    void OnActionCheck(ActionEvent event) {
    	setInfo(ip.get());
    }
    
    public Controller() throws IOException {

		FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/View.fxml"));
		loader.setController(this);
		loader.load();
	}
    
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		ip.bindBidirectional(textIP.textProperty());
		
		Task<String> ipInfo = new Task<String>() {

			@Override
			protected String call() throws Exception {
				Thread.sleep(200L);
				return ipifyService.IP();
			}
		};
		
		ipInfo.setOnSucceeded(event -> {
			ip.set(ipInfo.getValue());
			setInfo(ip.get());
		});
		
		ipInfo.setOnFailed(event -> {
			Alert alert = new Alert(AlertType.ERROR);
			alert.setTitle("GeoFX");
			alert.setHeaderText("Error");
			alert.setContentText("IP no valida");
			alert.showAndWait();
		});

		new Thread(ipInfo).start();
	}
	
	  private void setInfo(String ip) {
	    	
	    	Task<IpapiMessage> contenidoIP = new Task<IpapiMessage>() {

				@Override
				protected IpapiMessage call() throws Exception {
					Thread.sleep(100L);
					
					return ipapiService.message(ip);
				}
			};

			contenidoIP.setOnSucceeded(event -> {
				
				try {
					
					IpapiMessage ipapi = contenidoIP.get();
					
					labelLatitude.setText(contenidoIP.get().getLatitude().toString());
					labelLongitude.setText(contenidoIP.get().getLongitude().toString());
					labelLocation.setText(contenidoIP.get().getCountryName().concat(" (").concat(contenidoIP.get().getCountryCode().concat(")")));
					imageBandera.setImage(new Image("/iconos/banderas/64x42/"+contenidoIP.get().getCountryCode()+".png"));
					labelCity.setText(ipapi.getCity().concat(" (").concat(contenidoIP.get().getRegionName()).concat(")"));
					labelZIP.setText(contenidoIP.get().getZip());
					labelLanguage.setText(contenidoIP.get().getLocation().getLanguages().get(0).getName());
					labelZone.setText(contenidoIP.get().getTimeZone().getCode());
					labelCalling.setText(contenidoIP.get().getLocation().getCallingCode());
					labelCurrency.setText(contenidoIP.get().getCurrency().getName().concat(" (").concat(contenidoIP.get().getCurrency().getSymbol().concat(")")));
					labelP.setText(contenidoIP.get().getIp());
					labelISP.setText(contenidoIP.get().getConnection().getIsp());
					labelType.setText(contenidoIP.get().getType());
					labelASN.setText(contenidoIP.get().getConnection().getAsn().toString());
					labelHost.setText(contenidoIP.get().getHostname());
					labelLevel.setText(ipapi.getSecurity().getThreatLevel());
					
					if (ipapi.getSecurity().getThreatLevel().equals("low")) {
						labelSecure.setText("This IP is safe. No threats have been detected.");
						LabelPotential.setText("No threats have been detected for this IP address.");
					}
					if (ipapi.getSecurity().getThreatLevel().equals("normal")) {
						labelSecure.setText("This IP is safe but can have some threats.");
						LabelPotential.setText("No threats have been detected for this IP address.");
					}					
					if (ipapi.getSecurity().getThreatLevel().equals("high")) {
						labelSecure.setText("This IP is very dangerous. A lot threats have been detected.");
						LabelPotential.setText("Threats have been detected for this IP address.");
					}
					

				} catch (ExecutionException e) {
					e.printStackTrace();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			});
			new Thread(contenidoIP).start();
	    }
	

}
