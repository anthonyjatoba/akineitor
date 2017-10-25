package akineitor;

import javax.swing.JOptionPane;

public class Akineitor {

	public static Object[] i = new Object[] {};

	public static void main(String[] args) {
		raiz();
	}

	public static void personagem(String nome) {
		JOptionPane.showMessageDialog(null, "Seu personagem é " + nome);
	}

	public static void raiz() {
		int resposta = JOptionPane.showConfirmDialog(null, "O seu personagem é do gênero masculino?");
		if (resposta == JOptionPane.YES_OPTION) {
			generoM();
		} else {
			generoF();
		}
	}

	public static void generoM() {
		int resposta = JOptionPane.showConfirmDialog(null, "O seu personagem é um animal?");
		if (resposta == JOptionPane.YES_OPTION) {
			generoMAnimalS();
		} else {
			generoMAnimalN();
		}
	}

	public static void generoMAnimalN() {
		int resposta = JOptionPane.showConfirmDialog(null, "O seu personagem é protagonista?");
		if (resposta == JOptionPane.YES_OPTION) {
			generoMAnimalNProtagonistaS();
		} else {
			generoMAnimalNProtagonistaN();
		}
	}

	public static void generoMAnimalNProtagonistaS() {
		int resposta = JOptionPane.showConfirmDialog(null, "O seu personagem tem filhos?");
		if (resposta == JOptionPane.YES_OPTION) {
			generoMAnimalNProtagonistaSFilhosS();
		} else {
			generoMAnimalNProtagonistaSFilhosN();
		}
	}

	public static void generoMAnimalNProtagonistaSFilhosS() {
		int resposta = JOptionPane.showConfirmDialog(null, "O seu personagem é baixo?");
		if (resposta == JOptionPane.YES_OPTION) {
			generoMAnimalNProtagonistaSFilhosSBaixoS();
		} else {
			generoMAnimalNProtagonistaSFilhosSBaixoN();
		}
	}

	public static void generoMAnimalNProtagonistaSFilhosSBaixoN() {
		int resposta = JOptionPane.showConfirmDialog(null, "O seu personagem é gordo?");
		if (resposta == JOptionPane.YES_OPTION) {
			generoMAnimalNProtagonistaSFilhosSBaixoNGordoS();
		} else {
			generoMAnimalNProtagonistaSFilhosSBaixoNGordoN();
		}
	}

	public static void generoMAnimalNProtagonistaSFilhosSBaixoNGordoN() {
		int resposta = JOptionPane.showConfirmDialog(null, "O seu personagem é idoso?");
		if (resposta == JOptionPane.YES_OPTION) {
			personagem("Rick");
		} else {
			generoMAnimalNProtagonistaSFilhosSBaixoNGordoNIdosoN();
		}
	}

	public static void generoMAnimalNProtagonistaSFilhosSBaixoNGordoNIdosoN() {
		int resposta = JOptionPane.showConfirmDialog(null, "O seu personagem é adolescente?");
		if (resposta == JOptionPane.YES_OPTION) {
			personagem("Morty");
		} else {
			personagem("Betty Rubble");
		}
	}

	public static void generoMAnimalNProtagonistaSFilhosSBaixoNGordoS() {
		int resposta = JOptionPane.showConfirmDialog(null, "O seu personagem usa roupa branca?");
		if (resposta == JOptionPane.YES_OPTION) {
			personagem("Homer Simpson");
		} else {
			personagem("Fred Flinstone");
		}
	}

	public static void generoMAnimalNProtagonistaSFilhosSBaixoS() {
		int resposta = JOptionPane.showConfirmDialog(null, "O seu personagem usa roupa preta?");
		if (resposta == JOptionPane.YES_OPTION) {
			personagem("Popeye");
		} else {
			personagem("Barney Rubble");
		}
	}

	public static void generoMAnimalNProtagonistaSFilhosN() {
		int resposta = JOptionPane.showConfirmDialog(null, "O seu personagem é idiota?");
		if (resposta == JOptionPane.YES_OPTION) {
			generoMAnimalNProtagonistaSFilhosNIdiotaS();
		} else {
			generoMAnimalNProtagonistaSFilhosNIdiotaN();
		}
	}

	public static void generoMAnimalNProtagonistaSFilhosNIdiotaN() {
		int resposta = JOptionPane.showConfirmDialog(null, "O seu personagem é caucasiano?");
		if (resposta == JOptionPane.YES_OPTION) {
			generoMAnimalNProtagonistaSFilhosNIdiotaNCaucasianoS();
		} else {
			generoMAnimalNProtagonistaSFilhosNIdiotaNCaucasianoN();
		}
	}

	public static void generoMAnimalNProtagonistaSFilhosNIdiotaNCaucasianoS() {
		int resposta = JOptionPane.showConfirmDialog(null, "O seu personagem é adolescente?");
		if (resposta == JOptionPane.YES_OPTION) {
			personagem("Finn");
		} else {
			generoMAnimalNProtagonistaSFilhosNIdiotaNCaucasianoSAdolescenteN();
		}
	}

	public static void generoMAnimalNProtagonistaSFilhosNIdiotaNCaucasianoSAdolescenteN() {
		int resposta = JOptionPane.showConfirmDialog(null, "O seu personagem é adulto?");
		if (resposta == JOptionPane.YES_OPTION) {
			personagem("Fred");
		} else {
			personagem("Steven Universe");
		}
	}

	public static void generoMAnimalNProtagonistaSFilhosNIdiotaNCaucasianoN() {
		int resposta = JOptionPane.showConfirmDialog(null, "O seu personagem é inteligente?");
		if (resposta == JOptionPane.YES_OPTION) {
			personagem("Lisa Simpson");
		} else {
			personagem("Bart Simpson");
		}
	}

	public static void generoMAnimalNProtagonistaSFilhosNIdiotaS() {
		int resposta = JOptionPane.showConfirmDialog(null, "O seu personagem é adulto?");
		if (resposta == JOptionPane.YES_OPTION) {
			personagem("Salsicha");
		} else {
			personagem("Irmão do Jorel");
		}
	}

	public static void generoMAnimalNProtagonistaN() {
		int resposta = JOptionPane.showConfirmDialog(null, "O seu personagem tem filhos?");
		if (resposta == JOptionPane.YES_OPTION) {
			generoMAnimalNProtagonistaNFilhosS();
		} else {
			generoMAnimalNProtagonistaNFilhosN();
		}
	}

	public static void generoMAnimalNProtagonistaNFilhosS() {
		int resposta = JOptionPane.showConfirmDialog(null, "O seu personagem usa roupas brancas?");
		if (resposta == JOptionPane.YES_OPTION) {
			generoMAnimalNProtagonistaNFilhosSRoupaBranca();
		} else {
			generoMAnimalNProtagonistaNFilhosSRoupaBrancaN();
		}
	}

	public static void generoMAnimalNProtagonistaNFilhosSRoupaBranca() {
		int resposta = JOptionPane.showConfirmDialog(null, "O seu personagem usa roupas brancas?");
		if (resposta == JOptionPane.YES_OPTION) {
			personagem("Professor Utônio");
		} else {
			personagem("Greg Universe");
		}
	}

	public static void generoMAnimalNProtagonistaNFilhosSRoupaBrancaN() {
		int resposta = JOptionPane.showConfirmDialog(null, "O seu personagem é alto?");
		if (resposta == JOptionPane.YES_OPTION) {
			personagem("Jerry Smith");
		} else {
			personagem("Mr Poopybutthole");
		}
	}

	public static void generoMAnimalNProtagonistaNFilhosN() {
		int resposta = JOptionPane.showConfirmDialog(null, "O seu personagem é alto?");
		if (resposta == JOptionPane.YES_OPTION) {
			generoMAnimalNProtagonistaNFilhosNAltoS();
		} else {
			generoMAnimalNProtagonistaNFilhosNAltoN();
		}
	}

	public static void generoMAnimalNProtagonistaNFilhosNAltoS() {
		int resposta = JOptionPane.showConfirmDialog(null, "O seu personagem é adolescente?");
		if (resposta == JOptionPane.YES_OPTION) {
			personagem("Jorel");
		} else {
			personagem("Brutus");
		}
	}

	public static void generoMAnimalNProtagonistaNFilhosNAltoN() {
		int resposta = JOptionPane.showConfirmDialog(null, "O seu personagem é loiro?");
		if (resposta == JOptionPane.YES_OPTION) {
			personagem("Franjinha");
		} else {
			generoMAnimalNProtagonistaNFilhosNAltoNLoiroN();
		}
	}

	public static void generoMAnimalNProtagonistaNFilhosNAltoNLoiroN() {
		int resposta = JOptionPane.showConfirmDialog(null, "O seu personagem tem cabelos pretos?");
		if (resposta == JOptionPane.YES_OPTION) {
			generoMAnimalNProtagonistaNFilhosNAltoNLoiroNPretoS();
		} else {
			personagem("Bam Bam Rubble");
		}
	}

	public static void generoMAnimalNProtagonistaNFilhosNAltoNLoiroNPretoS() {
		int resposta = JOptionPane.showConfirmDialog(null, "O seu personagem usa roupa amarela?");
		if (resposta == JOptionPane.YES_OPTION) {
			personagem("Cascão");
		} else {
			personagem("Cebolinha");
		}
	}

	public static void generoMAnimalS() {
		int resposta = JOptionPane.showConfirmDialog(null, "O seu personagem é protagonista?");
		if (resposta == JOptionPane.YES_OPTION) {
			generoMAnimalSProtagonistaS();
		} else {
			generoMAnimalSProtagonistaN();
		}
	}

	public static void generoMAnimalSProtagonistaS() {
		int resposta = JOptionPane.showConfirmDialog(null, "O seu personagem tem filhos?");
		if (resposta == JOptionPane.YES_OPTION) {
			generoMAnimalSProtagonistaSFilhosS();
		} else {
			generoMAnimalSProtagonistaFilhosN();
		}
	}

	public static void generoMAnimalSProtagonistaSFilhosS() {
		int resposta = JOptionPane.showConfirmDialog(null, "O seu personagem é inteligente?");
		if (resposta == JOptionPane.YES_OPTION) {
			personagem("Jake");
		} else {
			personagem("Simba");
		}
	}

	public static void generoMAnimalSProtagonistaFilhosN() {
		int resposta = JOptionPane.showConfirmDialog(null, "O seu personagem é alto?");
		if (resposta == JOptionPane.YES_OPTION) {
			generoMAnimalSProtagonistaFilhosNAltoS();
		} else {
			generoMAnimalSProtagonistaFilhosNAltoN();
		}
	}

	public static void generoMAnimalSProtagonistaFilhosNAltoS() {
		int resposta = JOptionPane.showConfirmDialog(null, "O seu personagem é gordo?");
		if (resposta == JOptionPane.YES_OPTION) {
			personagem("Bojack Horseman");
		} else {
			personagem("Pernalonga");
		}
	}

	public static void generoMAnimalSProtagonistaFilhosNAltoN() {
		int resposta = JOptionPane.showConfirmDialog(null, "O seu personagem é baixo?");
		if (resposta == JOptionPane.YES_OPTION) {
			generoMAnimalSProtagonistaFilhosNAltoNBaixoS();
		} else {
			generoMAnimalSProtagonistaFilhosNAltoNBaixoN();
		}
	}

	public static void generoMAnimalSProtagonistaFilhosNAltoNBaixoN() {
		int resposta = JOptionPane.showConfirmDialog(null, "O seu personagem é medroso?");
		if (resposta == JOptionPane.YES_OPTION) {
			generoMAnimalSProtagonistaFilhosNAltoNBaixoNMedrosoS();
		} else {
			generoMAnimalSProtagonistaFilhosNAltoNBaixoNMedrosoN();
		}
	}

	public static void generoMAnimalSProtagonistaFilhosNAltoNBaixoNMedrosoN() {
		int resposta = JOptionPane.showConfirmDialog(null, "O seu personagem usa roupas?");
		if (resposta == JOptionPane.YES_OPTION) {
			personagem("Bob Esponja");
		} else {
			generoMAnimalSProtagonistaFilhosNAltoNBaixoNMedrosoNRoupasN();
		}
	}

	public static void generoMAnimalSProtagonistaFilhosNAltoNBaixoNMedrosoNRoupasN() {
		int resposta = JOptionPane.showConfirmDialog(null, "O seu personagem tem cor predominante azul?");
		if (resposta == JOptionPane.YES_OPTION) {
			personagem("Pica Pau");
		} else {
			generoMAnimalSProtagonistaFilhosNAltoNBaixoNMedrosoNRoupasNCorAzulN();
		}
	}

	public static void generoMAnimalSProtagonistaFilhosNAltoNBaixoNMedrosoNRoupasNCorAzulN() {
		int resposta = JOptionPane.showConfirmDialog(null, "O seu personagem tem cor predominante cinza?");
		if (resposta == JOptionPane.YES_OPTION) {
			personagem("Tom");
		} else {
			personagem("Gato Félix");
		}
	}

	public static void generoMAnimalSProtagonistaFilhosNAltoNBaixoNMedrosoS() {
		int resposta = JOptionPane.showConfirmDialog(null, "O seu personagem é gordo?");
		if (resposta == JOptionPane.YES_OPTION) {
			personagem("Dumbo");
		} else {
			generoMAnimalSProtagonistaFilhosNAltoNBaixoNMedrosoSGordoN();
		}
	}

	public static void generoMAnimalSProtagonistaFilhosNAltoNBaixoNMedrosoSGordoN() {
		int resposta = JOptionPane.showConfirmDialog(null, "O seu personagem tem cor predominante rosa?");
		if (resposta == JOptionPane.YES_OPTION) {
			personagem("Coragem");
		} else {
			personagem("Scooby-doo");
		}
	}

	public static void generoMAnimalSProtagonistaFilhosNAltoNBaixoS() {
		int resposta = JOptionPane.showConfirmDialog(null, "O seu personagem usa roupas?");
		if (resposta == JOptionPane.YES_OPTION) {
			personagem("Mickey Mouse");
		} else {
			personagem("Jerry");
		}
	}

	public static void generoMAnimalSProtagonistaN() {
		int resposta = JOptionPane.showConfirmDialog(null, "O seu personagem tem filhos?");
		if (resposta == JOptionPane.YES_OPTION) {
			generoMAnimalSProtagonistaNFilhosS();
		} else {
			generoMAnimalSProtagonistaNFilhosN();
		}
	}

	public static void generoMAnimalSProtagonistaNFilhosS() {
		int resposta = JOptionPane.showConfirmDialog(null, "O seu personagem é um vilão?");
		if (resposta == JOptionPane.YES_OPTION) {
			personagem("Scar");
		} else {
			generoMAnimalSProtagonistaNFilhosSVilaoN();
		}
	}

	public static void generoMAnimalSProtagonistaNFilhosSVilaoN() {
		int resposta = JOptionPane.showConfirmDialog(null, "O seu personagem é um gordo?");
		if (resposta == JOptionPane.YES_OPTION) {
			personagem("Seu Sirigueijo");
		} else {
			generoMAnimalSProtagonistaNFilhosSVilaoNGordoN();
		}
	}

	public static void generoMAnimalSProtagonistaNFilhosSVilaoNGordoN() {
		int resposta = JOptionPane.showConfirmDialog(null, "O seu personagem é um inteligente?");
		if (resposta == JOptionPane.YES_OPTION) {
			personagem("Mufasa");
		} else {
			personagem("Pluto");
		}
	}

	public static void generoMAnimalSProtagonistaNFilhosN() {
		int resposta = JOptionPane.showConfirmDialog(null, "O seu personagem é baixo?");
		if (resposta == JOptionPane.YES_OPTION) {
			generoMAnimalSProtagonistaNFilhosNBaixoS();
		} else {
			generoMAnimalSProtagonistaNFilhosNBaixoN();
		}
	}

	public static void generoMAnimalSProtagonistaNFilhosNBaixoN() {
		int resposta = JOptionPane.showConfirmDialog(null, "O seu personagem é gordo?");
		if (resposta == JOptionPane.YES_OPTION) {
			generoMAnimalSProtagonistaNFilhosNBaixoNGordoS();
		} else {
			generoMAnimalSProtagonistaNFilhosNBaixoNGordoN();
		}
	}

	public static void generoMAnimalSProtagonistaNFilhosNBaixoNGordoN() {
		int resposta = JOptionPane.showConfirmDialog(null, "O seu personagem usa roupas?");
		if (resposta == JOptionPane.YES_OPTION) {
			generoMAnimalSProtagonistaNFilhosNBaixoNGordoNRoupasS();
		} else {
			generoMAnimalSProtagonistaNFilhosNBaixoNGordoNRoupasN();
		}
	}

	public static void generoMAnimalSProtagonistaNFilhosNBaixoNGordoNRoupasS() {
		int resposta = JOptionPane.showConfirmDialog(null, "O seu personagem é alto?");
		if (resposta == JOptionPane.YES_OPTION) {
			personagem("Pateta");
		} else {
			generoMAnimalSProtagonistaNFilhosNBaixoNGordoNRoupasSAltoN();
		}
	}

	public static void generoMAnimalSProtagonistaNFilhosNBaixoNGordoNRoupasSAltoN() {
		int resposta = JOptionPane.showConfirmDialog(null, "O seu personagem usa roupas vermelhas?");
		if (resposta == JOptionPane.YES_OPTION) {
			personagem("Tio Patinhas");
		} else {
			generoMAnimalSProtagonistaNFilhosNBaixoNGordoNRoupasSAltoNVermelhoN();
		}
	}

	public static void generoMAnimalSProtagonistaNFilhosNBaixoNGordoNRoupasSAltoNVermelhoN() {
		int resposta = JOptionPane.showConfirmDialog(null, "O seu personagem usa roupas azuis?");
		if (resposta == JOptionPane.YES_OPTION) {
			personagem("Donald");
		} else {
			personagem("Lula Molusco");
		}
	}

	public static void generoMAnimalSProtagonistaNFilhosNBaixoNGordoNRoupasN() {
		int resposta = JOptionPane.showConfirmDialog(null, "O seu personagem é idiota?");
		if (resposta == JOptionPane.YES_OPTION) {
			generoMAnimalSProtagonistaNFilhosNBaixoNGordoNRoupasNIdiotaS();
		} else {
			personagem("Gary Caracol");
		}
	}

	public static void generoMAnimalSProtagonistaNFilhosNBaixoNGordoNRoupasNIdiotaS() {
		int resposta = JOptionPane.showConfirmDialog(null, "O seu personagem é medroso?");
		if (resposta == JOptionPane.YES_OPTION) {
			personagem("Frajola");
		} else {
			generoMAnimalSProtagonistaNFilhosNBaixoNGordoNRoupasNIdiotaSMedrosoN();
		}
	}

	public static void generoMAnimalSProtagonistaNFilhosNBaixoNGordoNRoupasNIdiotaSMedrosoN() {
		int resposta = JOptionPane.showConfirmDialog(null, "O seu personagem tem cor predominante marrom?");
		if (resposta == JOptionPane.YES_OPTION) {
			personagem("Taz");
		} else {
			personagem("Patolino");
		}
	}

	public static void generoMAnimalSProtagonistaNFilhosNBaixoNGordoS() {
		int resposta = JOptionPane.showConfirmDialog(null, "O seu personagem usa roupas?");
		if (resposta == JOptionPane.YES_OPTION) {
			personagem("Patrick Estrela");
		} else {
			personagem("Pumba");
		}
	}

	public static void generoMAnimalSProtagonistaNFilhosNBaixoS() {
		int resposta = JOptionPane.showConfirmDialog(null, "O seu personagem é um vilão?");
		if (resposta == JOptionPane.YES_OPTION) {
			personagem("Sheldon J. Plankton");
		} else {
			generoMAnimalSProtagonistaNFilhosNBaixoSVilaoN();
		}
	}

	public static void generoMAnimalSProtagonistaNFilhosNBaixoSVilaoN() {
		int resposta = JOptionPane.showConfirmDialog(null, "O seu personagem usa roupas?");
		if (resposta == JOptionPane.YES_OPTION) {
			generoMAnimalSProtagonistaNFilhosNBaixoSVilaoNRoupasS();
		} else {
			personagem("Timão");
		}
	}

	public static void generoMAnimalSProtagonistaNFilhosNBaixoSVilaoNRoupasS() {
		int resposta = JOptionPane.showConfirmDialog(null, "O seu personagem usa roupa azul?");
		if (resposta == JOptionPane.YES_OPTION) {
			personagem("Gaguinho");
		} else {
			personagem("Hortelino");
		}
	}

	public static void generoF() {
		double p = Double.NaN;
		if (i[4] == null) {
			personagem("Mônica");
		} else if (i[4].equals("S")) {
			Nd909cbb159();
		} else if (!i[4].equals("S")) {
			N1882075168();
		}
	}

	public static void Nd909cbb159() {
		double p = Double.NaN;
		if (i[2] == null) {
			personagem("Marge Simpson");
		} else if (i[2].equals("Adulto")) {
			N3900d79d160();
		} else if (!i[2].equals("Adulto")) {
			N258dda26164();
		}
	}

	public static void N3900d79d160() {
		double p = Double.NaN;
		if (i[6] == null) {
			personagem("Marge Simpson");
		} else if (i[6].equals("S")) {
			N1ee33fd7161();
		} else if (!i[6].equals("S")) {
			N1a0e4ac5163();
		}
	}

	public static void N1ee33fd7161() {
		double p = Double.NaN;
		if (i[7] == null) {
			personagem("Marge Simpson");
		} else if (i[7].equals("S")) {
			personagem("Marge Simpson");
		} else if (!i[7].equals("S")) {
			N13726954162();
		}
	}

	public static void N13726954162() {
		double p = Double.NaN;
		if (i[10] == null) {
			personagem("Wilma Flinstone");
		} else if (i[10].equals("Ruivo")) {
			personagem("Wilma Flinstone");
		} else if (!i[10].equals("Ruivo")) {
			personagem("Olívia Palito");
		}
	}

	public static void N1a0e4ac5163() {
		double p = Double.NaN;
		if (i[8] == null) {
			personagem("Daphne");
		} else if (i[8].equals("N")) {
			personagem("Daphne");
		} else if (!i[8].equals("N")) {
			personagem("Velma");
		}
	}

	public static void N258dda26164() {
		double p = Double.NaN;
		if (i[10] == null) {
			personagem("Maggie Simpson");
		} else if (i[10].equals("Loiro")) {
			N229754c7165();
		} else if (!i[10].equals("Loiro")) {
			N22afb108166();
		}
	}

	public static void N229754c7165() {
		double p = Double.NaN;
		if (i[8] == null) {
			personagem("Maggie Simpson");
		} else if (i[8].equals("N")) {
			personagem("Maggie Simpson");
		} else if (!i[8].equals("N")) {
			personagem("Lindinha");
		}
	}

	public static void N22afb108166() {
		double p = Double.NaN;
		if (i[9] == null) {
			personagem("Docinho");
		} else if (i[9].equals("N")) {
			N4a1f9ffa167();
		} else if (!i[9].equals("N")) {
			personagem("Mônica");
		}
	}

	public static void N4a1f9ffa167() {
		double p = Double.NaN;
		if (i[10] == null) {
			personagem("Florzinha");
		} else if (i[10].equals("Ruivo")) {
			personagem("Florzinha");
		} else if (!i[10].equals("Ruivo")) {
			personagem("Docinho");
		}
	}

	public static void N1882075168() {
		double p = Double.NaN;
		if (i[3] == null) {
			personagem("Beth");
		} else if (i[3].equals("N")) {
			N19a16def169();
		} else if (!i[3].equals("N")) {
			N31b73395176();
		}
	}

	public static void N19a16def169() {
		double p = Double.NaN;
		if (i[7] == null) {
			personagem("Beth");
		} else if (i[7].equals("S")) {
			N4659a822170();
		} else if (!i[7].equals("S")) {
			N304412a0172();
		}
	}

	public static void N4659a822170() {
		double p = Double.NaN;
		if (i[6] == null) {
			personagem("Beth");
		} else if (i[6].equals("S")) {
			personagem("Beth");
		} else if (!i[6].equals("S")) {
			N700f0f5c171();
		}
	}

	public static void N700f0f5c171() {
		double p = Double.NaN;
		if (i[10] == null) {
			personagem("Princesa Jujuba");
		} else if (i[10].equals("Rosa")) {
			personagem("Princesa Jujuba");
		} else if (!i[10].equals("Rosa")) {
			personagem("Garnet");
		}
	}

	public static void N304412a0172() {
		double p = Double.NaN;
		if (i[17] == null) {
			personagem("Magali");
		} else if (i[17].equals("Caucasiano")) {
			N2218cf52173();
		} else if (!i[17].equals("Caucasiano")) {
			N298b7b8b174();
		}
	}

	public static void N2218cf52173() {
		double p = Double.NaN;
		if (i[10] == null) {
			personagem("Pedrita Flinstone");
		} else if (i[10].equals("Ruivo")) {
			personagem("Pedrita Flinstone");
		} else if (!i[10].equals("Ruivo")) {
			personagem("Magali");
		}
	}

	public static void N298b7b8b174() {
		double p = Double.NaN;
		if (i[2] == null) {
			personagem("Summer");
		} else if (i[2].equals("Adolescente")) {
			personagem("Summer");
		} else if (!i[2].equals("Adolescente")) {
			N2176e409175();
		}
	}

	public static void N2176e409175() {
		double p = Double.NaN;
		if (i[8] == null) {
			personagem("Pérola");
		} else if (i[8].equals("N")) {
			personagem("Pérola");
		} else if (!i[8].equals("N")) {
			personagem("Ametista");
		}
	}

	public static void N31b73395176() {
		double p = Double.NaN;
		if (i[8] == null) {
			personagem("Sandy Esquilo");
		} else if (i[8].equals("N")) {
			personagem("Sandy Esquilo");
		} else if (!i[8].equals("N")) {
			personagem("Minnie Mouse");
		}
	}
}
