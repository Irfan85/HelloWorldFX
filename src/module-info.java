module HelloWorldFX {
	requires javafx.fxml;
	requires javafx.controls;
	
	opens sample;
	opens layouts;
	opens controls;
	opens events;
}