package interfaz;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JInternalFrame;

public class VentanaPrincipal {

	private JFrame frame;
	private MostrarMapa frameMap;
	private AgregarCiudad frameAgregarC;
	private Busqueda frameBusqueda;
	private AgregarRuta frameAgregarR;
	private Datos datos;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaPrincipal window = new VentanaPrincipal();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public VentanaPrincipal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setEnabled(false);
		frame.setBounds(100, 100, 600, 480);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		datos = new Datos();
		
		frameMap = new MostrarMapa(datos);
		JInternalFrame internalFrameMapa = frameMap._frame;
		frame.getContentPane().add(internalFrameMapa);	
		internalFrameMapa.setVisible(true);
		
		frameAgregarC = new AgregarCiudad(datos);
		JInternalFrame internalFrameAgregarC = frameAgregarC._frame;
		frame.getContentPane().add(internalFrameAgregarC);
		internalFrameAgregarC.setVisible(true);
		
		frameBusqueda = new Busqueda(datos);
		JInternalFrame internalFrameBusqueda = frameBusqueda._frame;
		frame.getContentPane().add(internalFrameBusqueda);
		internalFrameBusqueda.setVisible(true);
		
		frameAgregarR = new AgregarRuta(datos);
		JInternalFrame internalFrameAgregarR = frameAgregarR._frame;
		frame.getContentPane().add(internalFrameAgregarR);
		internalFrameAgregarR.setVisible(true);
	}
}
