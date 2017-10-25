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
		double p = Double.NaN;
		if (i[6] == null) {
			personagem("Seu Sirigueijo");
		} else if (i[6].equals("S")) {
			N4b66acd5142();
		} else if (!i[6].equals("S")) {
			N459c8072145();
		}
	}

	public static void N4b66acd5142() {
		double p = Double.NaN;
		if (i[5] == null) {
			personagem("Seu Sirigueijo");
		} else if (i[5].equals("N")) {
			N25cd01f7143();
		} else if (!i[5].equals("N")) {
			personagem("Scar");
		}
	}

	public static void N25cd01f7143() {
		double p = Double.NaN;
		if (i[9] == null) {
			personagem("Pluto");
		} else if (i[9].equals("N")) {
			N7e33b370144();
		} else if (!i[9].equals("N")) {
			personagem("Seu Sirigueijo");
		}
	}

	public static void N7e33b370144() {
		double p = Double.NaN;
		if (i[13] == null) {
			personagem("Mufasa");
		} else if (i[13].equals("S")) {
			personagem("Mufasa");
		} else if (!i[13].equals("S")) {
			personagem("Pluto");
		}
	}

	public static void N459c8072145() {
		double p = Double.NaN;
		if (i[8] == null) {
			personagem("Patrick Estrela");
		} else if (i[8].equals("N")) {
			N3b628c10146();
		} else if (!i[8].equals("N")) {
			N66f82374155();
		}
	}

	public static void N3b628c10146() {
		double p = Double.NaN;
		if (i[9] == null) {
			personagem("Lula Molusco");
		} else if (i[9].equals("N")) {
			N766de032147();
		} else if (!i[9].equals("N")) {
			N63c3e6ba154();
		}
	}

	public static void N766de032147() {
		double p = Double.NaN;
		if (i[11] == null) {
			personagem("Lula Molusco");
		} else if (i[11].equals("S")) {
			N152675bc148();
		} else if (!i[11].equals("S")) {
			N2c0efd1151();
		}
	}

	public static void N152675bc148() {
		double p = Double.NaN;
		if (i[7] == null) {
			personagem("Pateta");
		} else if (i[7].equals("S")) {
			personagem("Pateta");
		} else if (!i[7].equals("S")) {
			N3418e87a149();
		}
	}

	public static void N3418e87a149() {
		double p = Double.NaN;
		if (i[12] == null) {
			personagem("Tio Patinhas");
		} else if (i[12].equals("Vermelho")) {
			personagem("Tio Patinhas");
		} else if (!i[12].equals("Vermelho")) {
			N1bb5e0e5150();
		}
	}

	public static void N1bb5e0e5150() {
		double p = Double.NaN;
		if (i[12] == null) {
			personagem("Donald");
		} else if (i[12].equals("Azul")) {
			personagem("Donald");
		} else if (!i[12].equals("Azul")) {
			personagem("Lula Molusco");
		}
	}

	public static void N2c0efd1151() {
		double p = Double.NaN;
		if (i[14] == null) {
			personagem("Gary Caracol");
		} else if (i[14].equals("N")) {
			personagem("Gary Caracol");
		} else if (!i[14].equals("N")) {
			N24ede1a0152();
		}
	}

	public static void N24ede1a0152() {
		double p = Double.NaN;
		if (i[16] == null) {
			personagem("Patolino");
		} else if (i[16].equals("N")) {
			N5745867f153();
		} else if (!i[16].equals("N")) {
			personagem("Frajola");
		}
	}

	public static void N5745867f153() {
		double p = Double.NaN;
		if (i[17] == null) {
			personagem("Taz");
		} else if (i[17].equals("Marrom")) {
			personagem("Taz");
		} else if (!i[17].equals("Marrom")) {
			personagem("Patolino");
		}
	}

	public static void N63c3e6ba154() {
		double p = Double.NaN;
		if (i[11] == null) {
			personagem("Patrick Estrela");
		} else if (i[11].equals("S")) {
			personagem("Patrick Estrela");
		} else if (!i[11].equals("S")) {
			personagem("Pumba");
		}
	}

	public static void N66f82374155() {
		double p = Double.NaN;
		if (i[5] == null) {
			personagem("Timão");
		} else if (i[5].equals("N")) {
			N2d532eea156();
		} else if (!i[5].equals("N")) {
			personagem("Sheldon J. Plankton");
		}
	}

	public static void N2d532eea156() {
		double p = Double.NaN;
		if (i[11] == null) {
			personagem("Hortelino");
		} else if (i[11].equals("S")) {
			N56de2341157();
		} else if (!i[11].equals("S")) {
			personagem("Timão");
		}
	}

	public static void N56de2341157() {
		double p = Double.NaN;
		if (i[12] == null) {
			personagem("Gaguinho");
		} else if (i[12].equals("Azul")) {
			personagem("Gaguinho");
		} else if (!i[12].equals("Azul")) {
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
