import java.util.Locale;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		System.out.print("Entre com o número da conta: ");
		int numberAccount = sc.nextInt();
		sc.nextLine();

		System.out.print("Entre com o nome do própietario da conta:");
		String holderAccount = sc.nextLine();

		System.out.print("Deseja depositar algum valor ? (sim/não): ");
		String confirmation = sc.next();

		Data data;

		if (confirmation.equalsIgnoreCase("sim")) {
			System.out.print("Entre com o valor que deseja depositar: ");
			double balanceAccount = sc.nextDouble();
			data = new Data(numberAccount, holderAccount, balanceAccount);
		} else {
			data = new Data(numberAccount, holderAccount);
		}

		System.out.print( data);

		System.out.println("\nDeseja depositar algum valor? (sim/não): ");
		confirmation = sc.next();
		if (confirmation.equalsIgnoreCase("sim")) {
			System.out.println("\nEntre com o valor que deseja depositar");
			double balanceAccount = sc.nextDouble();
			data.addBalance(balanceAccount);
		}

		System.out.print(data);

		System.out.print("\nDeseja sacar algum valor? (sim/não): ");
		confirmation = sc.next();
		if (confirmation.equalsIgnoreCase("sim")) {
			System.out.print("Entre com o valor que deseja sacar: ");
			double balanceAccount = sc.nextDouble();
			data.removeBalance(balanceAccount);
			System.out.print(data);
		}

		sc.close();
	}

}
