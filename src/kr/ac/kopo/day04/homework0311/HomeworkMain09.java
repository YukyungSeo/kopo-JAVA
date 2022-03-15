package kr.ac.kopo.day04.homework0311;

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
public class HomeworkMain09 {

	public static void main(String[] args) {

		int line = (int)(Math.random() * 10) + 3;
		if (line % 2 == 0)
			line--;

		System.out.println("line : " + line);

		int star = 0;
		for (int i = 0; i < line; i++) {

			for (int j = 0; j < line; j++) {
				System.out.print(j <= star || j >= line - star - 1 ? '*' : '-');
			}
			System.out.println();
			star += i < line / 2 ? 1 : -1;
		}

	}
}
