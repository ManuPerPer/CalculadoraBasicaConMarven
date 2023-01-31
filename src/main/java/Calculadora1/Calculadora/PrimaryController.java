package Calculadora1.Calculadora;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Modality;
import javafx.stage.Stage;



public class PrimaryController implements Initializable{

	static boolean primerValor = true;
	static boolean sumando = false;
	static boolean restando = false;
	static boolean multiplicando = false;
	static boolean dividiendo = false;
	static boolean tieneComa1 = false;
	static boolean tieneComa2 = false;

	static double valor1 = 0;
	static double valor2 = 0;
	static String valor1String = null;
	static String valor2String = null;
	static double resultado = 0;
	static String resulString = null;

	@FXML
	private Button btn0;

	@FXML
	private Button btn1;

	@FXML
	private Button btn2;

	@FXML
	private Button btn3;

	@FXML
	private Button btn4;

	@FXML
	private Button btn5;

	@FXML
	private Button btn6;

	@FXML
	private Button btn7;

	@FXML
	private Button btn8;

	@FXML
	private Button btn9;

	@FXML
	private Button btnComa;

	@FXML
	private Button btnDiv;

	@FXML
	private Button btnMultiplicar;

	@FXML
	private Button btnResta;

	@FXML
	private Button btnSuma;

	@FXML
	private TextField pantalla;
	

	@FXML
	private Button btnResultado;
	@FXML
	private Button btnReset;
	@FXML
	private Button btnInfo;
	@FXML
    void clickAcerca(ActionEvent event) {
		
		Parent root= null;
		 try {
			 
	           // Cargo la vista
	           FXMLLoader loader = new FXMLLoader(getClass().getResource("hija.fxml"));
	          
	           // Cargo la ventana
	           root = loader.load();
	            
	           // Creo el Scene
	           Scene scene = new Scene(root);
	           Stage stage = new Stage();
	           stage.setResizable(true);
	           stage.initModality(Modality.APPLICATION_MODAL);
	           stage.setScene(scene);
	           stage.showAndWait();
	         
	 
	       } catch (IOException e) {
	           Alert alert = new Alert(Alert.AlertType.ERROR);
	           alert.setHeaderText(null);
	           alert.setTitle("Error");
	           alert.setContentText(e.getMessage());
	           alert.showAndWait();
	           e.printStackTrace();
	      
	       }

    }

	@FXML
	void click(ActionEvent event) throws InterruptedException {

		Button btn = (Button) event.getSource();
		
		try {
			
		

		if (btn1 == btn) {
			if (primerValor == true) {
				if (valor1String == null) {
					valor1String = "1";

				} else {
					valor1String = valor1String + "1";

				}
				pantalla.setText(valor1String);
			} else {
				// estamos en el segundo operador
				if (valor2String == null) {
					valor2String = "1";
				} else {
					valor2String = valor2String + "1";
				}
				pantalla.setText(valor2String);
			}

		}

		else if (btn2 == btn) {
			if (primerValor == true) {
				if (valor1String == null) {
					valor1String = "2";
				} else {
					valor1String = valor1String + "2";
				}
				pantalla.setText(valor1String);

			} else {
				// estamos en el segundo operador
				if (valor2String == null) {
					valor2String = "2";
				} else {
					valor2String = valor2String + "2";
				}
				pantalla.setText(valor2String);
			}

		} else if (btn3 == btn) {
			if (primerValor == true) {
				if (valor1String == null) {
					valor1String = "3";
				} else {
					valor1String = valor1String + "3";
				}
				pantalla.setText(valor1String);

			} else {
				// estamos en el segundo operador
				if (valor2String == null) {
					valor2String = "3";
				} else {
					valor2String = valor2String + "3";
				}
				pantalla.setText(valor2String);
			}

		} else if (btn4 == btn) {
			if (primerValor == true) {
				if (valor1String == null) {
					valor1String = "4";
				} else {
					valor1String = valor1String + "4";
				}
				pantalla.setText(valor1String);

			} else {
				// estamos en el segundo operador
				if (valor2String == null) {
					valor2String = "4";
				} else {
					valor2String = valor2String + "4";
				}
				pantalla.setText(valor2String);
			}

		} else if (btn5 == btn) {
			if (primerValor == true) {
				if (valor1String == null) {
					valor1String = "5";
				} else {
					valor1String = valor1String + "5";
				}
				pantalla.setText(valor1String);

			} else {
				// estamos en el segundo operador
				if (valor2String == null) {
					valor2String = "5";
				} else {
					valor2String = valor2String + "5";
				}
				pantalla.setText(valor2String);
			}

		} else if (btn6 == btn) {
			if (primerValor == true) {
				if (valor1String == null) {
					valor1String = "6";
				} else {
					valor1String = valor1String + "6";
				}
				pantalla.setText(valor1String);
			} else {
				// estamos en el segundo operador
				if (valor2String == null) {
					valor2String = "6";
				} else {
					valor2String = valor2String + "6";
				}
				pantalla.setText(valor2String);
			}

		} else if (btn7 == btn) {
			if (primerValor == true) {
				if (valor1String == null) {
					valor1String = "7";
				} else {
					valor1String = valor1String + "7";
				}
				pantalla.setText(valor1String);

			} else {
				// estamos en el segundo operador
				if (valor2String == null) {
					valor2String = "7";
				} else {
					valor2String = valor2String + "7";
				}
				pantalla.setText(valor2String);
			}

		} else if (btn8 == btn) {
			if (primerValor == true) {
				if (valor1String == null) {
					valor1String = "8";
				} else {
					valor1String = valor1String + "8";
				}
				pantalla.setText(valor1String);

			} else {
				// estamos en el segundo operador
				if (valor2String == null) {
					valor2String = "8";
				} else {
					valor2String = valor2String + "8";
				}
				pantalla.setText(valor2String);
			}

		} else if (btn9 == btn) {
			if (primerValor == true) {
				if (valor1String == null) {
					valor1String = "9";
				} else {
					valor1String = valor1String + "9";
				}
				pantalla.setText(valor1String);

			} else {
				// estamos en el segundo operador
				if (valor2String == null) {
					valor2String = "9";
				} else {
					valor2String = valor2String + "9";
				}
				pantalla.setText(valor2String);
			}

		} else if (btn0 == btn) {
			if (primerValor == true) {
				if (valor1String == null) {
					// este podriamos ahorrarnoslo.
					valor1String = "0";
				} else {
					valor1String = valor1String + "0";
				}
				pantalla.setText(valor1String);

			} else {
				// estamos en el segundo operador
				if (valor2String == null) {
					valor2String = "0";
				} else {
					valor2String = valor2String + "0";
				}
				pantalla.setText(valor2String);
			}

		} else if (btnComa == btn) {

			if (primerValor == true) {
				if (tieneComa1 == false) {

					if (primerValor == true) {
						if (valor1String == null) {
							// este podriamos ahorrarnoslo.
							valor1String = "0.";
						} else {
							valor1String = valor1String + ".";
						}
						pantalla.setText(valor1String);

					}

					tieneComa1 = true;
				}
			} else {
				if (tieneComa2 == false) {
					// estamos en el segundo operador
					if (valor2String == null) {
						valor2String = "0.";
					} else {
						valor2String = valor2String + ".";
					}
					pantalla.setText(valor2String);

					tieneComa2 = true;
				}
			}

		} else if (btnSuma == btn) {

			sumando = true;
			restando = false;
			dividiendo = false;
			multiplicando = false;

			if (primerValor == true) {

				valor1 = Double.valueOf(valor1String);
				pantalla.setText("+");
				cambiaOperador();

			}

		} else if (btnResta == btn) {

			sumando = false;
			restando = true;
			dividiendo = false;
			multiplicando = false;

			if (primerValor == true) {

				valor1 = Double.valueOf(valor1String);
				cambiaOperador();
				pantalla.setText("-");

			}

		} else if (btnMultiplicar == btn) {

			sumando = false;
			restando = false;
			dividiendo = false;
			multiplicando = true;

			if (primerValor == true) {

				valor1 = Double.valueOf(valor1String);
				cambiaOperador();
				pantalla.setText("*");

			}

		} else if (btnDiv == btn) {

			sumando = false;
			restando = false;
			dividiendo = true;
			multiplicando = false;

			if (primerValor == true) {
				valor1 = Double.valueOf(valor1String);
				cambiaOperador();
				pantalla.setText("/");
			}

		}

		else if (btn == btnResultado) {

			if (sumando == true || restando == true || multiplicando == true || dividiendo == true) {

			
				valor2 = Double.valueOf(valor2String);

				if (sumando == true) {
					resultado = metodoSuma(valor1, valor2);

				} else if (restando == true) {
					resultado = metodoResta(valor1, valor2);
				} else if (multiplicando == true) {
					resultado = metodoMultiplica(valor1, valor2);
				} else if (dividiendo == true) {
					resultado = metodoDivide(valor1, valor2);
				}
				resultado = Math.round(resultado * 100.0) / 100.0;

				resulString = String.valueOf(resultado);
				pantalla.setText(resulString);
				reseteaValoresACero();

			}
		}
		
		else if (btnReset == btn) {
			sumando=false;
			restando=false;
			multiplicando=false;
			dividiendo=false;
			
			reseteaValoresACero();
			pantalla.setText("0");
			
		}

		
		
		
		
		
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	public void reseteaValoresACero() {
		valor1 = 0;
		valor2 = 0;
		valor1String = null;
		valor2String = null;
		resultado = 0;
		resulString = null;
		primerValor = true;
		tieneComa1 = false;
		tieneComa2 = false;
	}

	public Double metodoDivide(double v1, double v2) {

		resultado = v1 / v2;
		resulString = String.valueOf(resultado);
		return resultado;
	}

	public Double metodoMultiplica(double v1, double v2) {

		resultado = v1 * v2;
		resulString = String.valueOf(resultado);
		return resultado;
	}

	public Double metodoSuma(double v1, double v2) {

		resultado = v1 + v2;
		resulString = String.valueOf(resultado);
		return resultado;
	}

	public Double metodoResta(double v1, double v2) {

		resultado = v1 - v2;
		resulString = String.valueOf(resultado);
		return resultado;
	}

	public void cambiaOperador() {

		if (primerValor == true) {
			primerValor = false;
		} else {
			primerValor = true;
		}
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		pantalla.setText("0");
	}

	
}
