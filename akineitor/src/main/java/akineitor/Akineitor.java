package akineitor;

import javax.swing.JOptionPane;

public class Akineitor {

	public static Object[] i = new Object[] {};

	public static void main(String[] args) {
		while (true) {
			int resposta = JOptionPane.showConfirmDialog(null, "Iniciar um novo jogo?");
			if (resposta == JOptionPane.YES_OPTION) {
				raiz();
			} else {
				break;
			}
		}
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
		int resposta = JOptionPane.showConfirmDialog(null, "O seu personagem é um protagonista?");
		if (resposta == JOptionPane.YES_OPTION) {
			generoFProtagonistaS();
		} else {
			generoFProtagonistaN();
		}
	}

	public static void generoFProtagonistaS() {
		int resposta = JOptionPane.showConfirmDialog(null, "O seu personagem é um adulto?");
		if (resposta == JOptionPane.YES_OPTION) {
			generoFProtagonistaSAdultoS();
		} else {
			generoFProtagonistaSAdultoN();
		}
	}

	public static void generoFProtagonistaSAdultoS() {
		int resposta = JOptionPane.showConfirmDialog(null, "O seu personagem possui filhos?");
		if (resposta == JOptionPane.YES_OPTION) {
			generoFProtagonistaSAdultoSFilhoS();
		} else {
			generoFProtagonistaSAdultoSFilhoN();
		}
	}

	public static void generoFProtagonistaSAdultoSFilhoS() {
		int resposta = JOptionPane.showConfirmDialog(null, "O seu personagem é alto?");
		if (resposta == JOptionPane.YES_OPTION) {
			personagem("Marge Simpson");
		} else {
			generoFProtagonistaSAdultoSFilhoSAltoN();
		}
	}

	public static void generoFProtagonistaSAdultoSFilhoSAltoN() {
		int resposta = JOptionPane.showConfirmDialog(null, "O seu personagem é ruivo?");
		if (resposta == JOptionPane.YES_OPTION) {
			personagem("Wilma Flinstone");
		} else {
			personagem("Olívia Palito");
		}
	}

	public static void generoFProtagonistaSAdultoSFilhoN() {
		int resposta = JOptionPane.showConfirmDialog(null, "O seu personagem é baixo?");
		if (resposta == JOptionPane.YES_OPTION) {
			personagem("Velma");
		} else {
			personagem("Daphne");
		}
	}

	public static void generoFProtagonistaSAdultoN() {
		int resposta = JOptionPane.showConfirmDialog(null, "O seu personagem é loiro?");
		if (resposta == JOptionPane.YES_OPTION) {
			generoFProtagonistaSAdultoNLoiroS();
		} else {
			generoFProtagonistaSAdultoNLoiroN();
		}
	}

	public static void generoFProtagonistaSAdultoNLoiroS() {
		int resposta = JOptionPane.showConfirmDialog(null, "O seu personagem é baixo?");
		if (resposta == JOptionPane.YES_OPTION) {
			personagem("Lindinha");
		} else {
			personagem("Maggie Simpson");
		}
	}

	public static void generoFProtagonistaSAdultoNLoiroN() {
		int resposta = JOptionPane.showConfirmDialog(null, "O seu personagem é gordo?");
		if (resposta == JOptionPane.YES_OPTION) {
			personagem("Mônica");
		} else {
			generoFProtagonistaSAdultoNLoiroNGordoN();
		}
	}

	public static void generoFProtagonistaSAdultoNLoiroNGordoN() {
		int resposta = JOptionPane.showConfirmDialog(null, "O seu personagem é ruivo?");
		if (resposta == JOptionPane.YES_OPTION) {
			personagem("Florzinha");
		} else {
			personagem("Docinho");
		}
	}

	public static void generoFProtagonistaN() {
		int resposta = JOptionPane.showConfirmDialog(null, "O seu personagem é um animal?");
		if (resposta == JOptionPane.YES_OPTION) {
			generoFProtagonistaNAnimalS();
		} else {
			generoFProtagonistaNAnimalN();
		}
	}

	public static void generoFProtagonistaNAnimalN() {
		int resposta = JOptionPane.showConfirmDialog(null, "O seu personagem é alto?");
		if (resposta == JOptionPane.YES_OPTION) {
			generoFProtagonistaNAnimalNAltoS();
		} else {
			generoFProtagonistaNAnimalNAltoN();
		}
	}

	public static void generoFProtagonistaNAnimalNAltoS() {
		int resposta = JOptionPane.showConfirmDialog(null, "O seu personagem possui filhos?");
		if (resposta == JOptionPane.YES_OPTION) {
			personagem("Beth");
		} else {
			generoFProtagonistaNAnimalNAltoSFilhoN();
		}
	}

	public static void generoFProtagonistaNAnimalNAltoSFilhoN() {
		int resposta = JOptionPane.showConfirmDialog(null, "O seu personagem tem cabelo rosa?");
		if (resposta == JOptionPane.YES_OPTION) {
			personagem("Princesa Jujuba");
		} else {
			personagem("Garnet");
		}
	}

	public static void generoFProtagonistaNAnimalNAltoN() {
		int resposta = JOptionPane.showConfirmDialog(null, "O seu personagem é caucasiano?");
		if (resposta == JOptionPane.YES_OPTION) {
			generoFProtagonistaNAnimalNAltoNCaucasianoS();
		} else {
			generoFProtagonistaNAnimalNAltoNCaucasianoN();
		}
	}

	public static void generoFProtagonistaNAnimalNAltoNCaucasianoS() {
		int resposta = JOptionPane.showConfirmDialog(null, "O seu personagem é ruivo?");
		if (resposta == JOptionPane.YES_OPTION) {
			personagem("Pedrita Flinstone");
		} else {
			personagem("Magali");
		}
	}

	public static void generoFProtagonistaNAnimalNAltoNCaucasianoN() {
		int resposta = JOptionPane.showConfirmDialog(null, "O seu personagem é adolescente?");
		if (resposta == JOptionPane.YES_OPTION) {
			personagem("Summer");
		} else {
			generoFProtagonistaNAnimalNAltoNCaucasianoNAdolescenteN();
		}
	}

	public static void generoFProtagonistaNAnimalNAltoNCaucasianoNAdolescenteN() {
		int resposta = JOptionPane.showConfirmDialog(null, "O seu personagem é baixo?");
		if (resposta == JOptionPane.YES_OPTION) {
			personagem("Ametista");
		} else {
			personagem("Pérola");
		}
	}

	public static void generoFProtagonistaNAnimalS() {
		int resposta = JOptionPane.showConfirmDialog(null, "O seu personagem é baixo?");
		if (resposta == JOptionPane.YES_OPTION) {
			personagem("Minnie Mouse");
		} else {
			personagem("Sandy Esquilo");
		}
	}
}
