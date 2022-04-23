import java.util.Scanner;

public class DataSigno {
    public static void main(String[] args){
        int dia, mes, ano, idade;
        int escolha;
        Scanner in = new Scanner(System.in);

        do{
            do{
                System.out.println("Digite o seu dia de nascimento:");
                dia = in.nextInt();
            } while(dia < 1 || dia > 31);
            do{
                System.out.println("Digite o seu mês de nascimento:");
                mes = in.nextInt();
            } while(mes < 1 || mes > 12);
            do{
                System.out.println("Digite o ano de seu nascimento");
                ano = in.nextInt();
            }while (ano < 1900 || ano > 2022);       

        switch(mes)
        {
            case 1:
                if (dia <= 20){
                    System.out.println("Seu signo é: Capricórnio\n");
                }else{
                    System.out.println("Seu signo é: Aquário\n");
                }
                break;
            case 2:
                if (dia <= 19){
                    System.out.println("Seu signo é: Aquário\n");
                }else{
                    System.out.println("Seu signo é: Peixes\n");
                }
                break;
            case 3: 
                if (dia <= 20){
                    System.out.println("Seu signo é: Peixes\n");
                }
                else{
                    System.out.println("Seu signo é: Áries\n");
                }
                break;
            case 4:
                if (dia <= 20){
                    System.out.println("Seu signo é: Áries\n");
                }else{
                    System.out.println("Seu signo é: Touro\n");
                }
                break;
            case 5:
                if (dia <= 20){
                    System.out.println("Seu signo é: Touro\n");
                }else{
                    System.out.println("Seu signo é: Gêmeos\n");
                }
                break;
            case 6:
                if (dia <= 20){
                    System.out.println("Seu signo é: Gêmeos\n");
                }else{
                    System.out.println("Seu signo é: Câncer\n");
                }
                break;
            case 7:
                if (dia<= 21){
                    System.out.println("Seu signo é: Câncer\n");
                }else{
                    System.out.println("Seu signo é: Leão\n");
                }
                break;
            case 8:
                if (dia<=22){
                    System.out.println("Seu signo é: Leão\n");
                }else{
                    System.out.println("Seu signo é: Virgem\n");
                }
                break;
            case 9:
                if (dia<=22){
                    System.out.println("Seu signo é: virgem\n");
                }else{
                    System.out.println("Seu signo é: libra\n");
                }
                break;
            case 10:
                if (dia<=22){
                    System.out.println("Seu signo é : libra\n");
                }
                else{
                    System.out.println("Seu signo é : escorpião\n");
                }
                break;
            case 11:
                if (dia<=21){
                    System.out.println("Seu signo é : escorpião\n");
                }
                else{  
                    System.out.println("Seu signo é : sagitário\n");
                }
                break;
            case 12:
                
                if (dia<=21){
                    System.out.println("Seu signo é : sagitário\\n");
                }
                else{
                    System.out.println("Seu signo é : capricórnio\n");
                }
                break;
        }
        	idade = 2022 - ano;
	        System.out.println("Seu dia de nascimento é: " + dia);
	        System.out.println("");
	        System.out.println("Seu mês de nascimento é: " + mes);
	        System.out.println("");
	        System.out.println("Seu ano de nascimento é: " + ano);
	        System.out.println("");
	        System.out.println("Sua idade é: " + idade + " anos");
	        System.out.println("Ou ainda vai fazer.");
	        System.out.println("");
	        System.out.println("Caso queria continuar digitando datas, escreva 1, caso não queira, digite outro número.");
	        escolha = in.nextInt();
        } while (escolha == 1 );
        in.close();
    }
}