package assignmentWeek3;

public class Elements extends Button {
	public static void main(String[] args) {
		Button ButtonObj = new  Button();
		TextField TextFielldObj = new TextField();
		CheckBoxButton CheckBoxButtonObj = new CheckBoxButton();
	    RadioButton RadioButtonobj = new RadioButton();
	    
	    ButtonObj.click();
	    ButtonObj.setText("Click On Submit Button");
	    ButtonObj.submit();
	    
	    TextFielldObj.getText();
	    
	    CheckBoxButtonObj.clickCheckButton();
	    RadioButtonobj.selectRadioButton();
	}
	
	

}
