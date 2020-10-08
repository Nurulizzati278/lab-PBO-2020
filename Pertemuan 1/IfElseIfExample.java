public class IfElseIfExample {
	public static void main(String[] args) {
		int marks=65;

		if(marks<50){
			System.out.println("fail");
		}
		else if(marks>=50 && marks<60){
			System.out.println("D grade");
		}
		else if(marks>=60 && marks<70){
			System.out.println("C grade");
		}
		else if(marks>=70 && marks<80){
			System.out.println("B grade");
		}
		else if(marks>=80 && marks<90){
			System.out.println("A grade");
		}else if(marks>=90 && marks<100){
			System.out.println("A+ grade");
		}else{
			System.out.println("Invalid!");
		}
	}
}
/*penjelasan program diatas
	program di atas digunakan untuk mencoba If-Else if, dimana pada code diatas hasil outputnya adalah C grade,
	karena dalam if keadaannya bernilai false, kemudian dicek pada else if yang D grade ternyata bernilai 
	false juga, kemudian dicek ke else if berikutnya dan ternyata brnilai true
*/