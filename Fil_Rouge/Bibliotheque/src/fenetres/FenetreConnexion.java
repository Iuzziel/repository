package fenetres;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.GridLayout;
import java.awt.Dimension;

public class FenetreConnexion extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6196409418829667588L;
	
	//Données membre
	private JTextField textFieldConnexionIdentifiant;
	private JPasswordField pwdFieldConnexion;

	public FenetreConnexion(){
		setPreferredSize(new Dimension(250, 400));
		setMinimumSize(new Dimension(250, 200));
		setMaximumSize(new Dimension(400, 400));
		getContentPane().setLayout(new BorderLayout(0, 0));

		//Titre
		JLabel lblConnexionAuxComptes = new JLabel("Connexion aux comptes Employ\u00E9s :");
		lblConnexionAuxComptes.setHorizontalAlignment(SwingConstants.CENTER);
		getContentPane().add(lblConnexionAuxComptes, BorderLayout.NORTH);

		//Panel IdMdp + Boutton
		JPanel panConnexion = new JPanel();
		panConnexion.setBorder(new TitledBorder(null, "Entrez vos identifiants", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		getContentPane().add(panConnexion, BorderLayout.CENTER);
		panConnexion.setLayout(new BoxLayout(panConnexion, BoxLayout.Y_AXIS));

		//Panel Id + MdP
		JPanel panConnexionIdPass = new JPanel();
		panConnexion.add(panConnexionIdPass);
		panConnexionIdPass.setLayout(new GridLayout(0, 1, 5, 5));

		//Panel Id
		JPanel panConnexionId = new JPanel();
		panConnexionIdPass.add(panConnexionId);

		JLabel lblConnexionIdentifiant = new JLabel("Identifiant :");
		panConnexionId.add(lblConnexionIdentifiant);
		textFieldConnexionIdentifiant = new JTextField();
		panConnexionId.add(textFieldConnexionIdentifiant);
		textFieldConnexionIdentifiant.setColumns(10);

		//Panel MdP
		JPanel panConnexionPass = new JPanel();
		panConnexionIdPass.add(panConnexionPass);

		JLabel lblConnexionPassword = new JLabel("Mot de Passe :");
		panConnexionPass.add(lblConnexionPassword);
		pwdFieldConnexion = new JPasswordField();
		panConnexionPass.add(pwdFieldConnexion);
		pwdFieldConnexion.setColumns(10);

		//Panel des boutton
		JPanel panConnexionBtn = new JPanel();
		panConnexionIdPass.add(panConnexionBtn);
		JButton btnConnexionValider = new JButton("Valider");
		panConnexionBtn.add(btnConnexionValider);
		JButton btnConnexionAnnuler = new JButton("Annuler");
		panConnexionBtn.add(btnConnexionAnnuler);

	}

}