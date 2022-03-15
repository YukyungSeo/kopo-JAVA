package kr.ac.kopo.day04.homwork0311;

/*
 			*	-		*
*-------*	0	1-7		8	
**-----**	1	2-6		7
***---***	2	3-5		6
****-****	3	4		5
*********	4	-		4
****-****	3	4		5
***---***	2	3-5		6
**-----**	1	2-6		7
*-------*	0	1-7		8

*/
public class HomeworkMain09_2 {

	public static void main(String[] args) {

		int star = 0;
		for (int i = 0; i < 9; i++) {

			for (int j = 0; j < 9; j++) {
				System.out.print(j <= star || j >= 8 - star ? '*' : '-');
			}
			System.out.println();
			star += i < 4 ? 1 : -1;
		}

	}
}
