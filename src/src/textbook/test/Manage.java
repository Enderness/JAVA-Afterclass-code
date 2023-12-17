package textbook.test;

import java.util.Scanner;

/**
 * ���һ����ѧ������ϵͳ
 * 1.���ѧ����Ϣ\n 2.��ʾѧ����Ϣ\n 3.ɾ��ѧ����Ϣ\n 4.�޸�ѧ����Ϣ\n5.�鿴ѧ����Ϣ\n 6.����\n7.�˳�
 * 
 */

public class Manage {
	// ��ģ�飻
	public static void main(String[] args) {
		Integer[] studentId = new Integer[100];
		Integer[] studentScore = new Integer[100];
		String[] studentName = new String[100];
		int number = 0;
		Integer studentCount = 0;
		int time = 0;
		System.out.println("��ӭ����ѧ������ϵͳ\n1.���ѧ����Ϣ\n2.��ʾѧ����Ϣ\n" +
				"3.ɾ��ѧ����Ϣ\n4.�޸�ѧ����Ϣ\n5.��ѯѧ����Ϣ\n6.����\n7.�˳�");
		while (true) {
			System.out.println("������ѡ��");
			Scanner scanner = new Scanner(System.in);
			number = scanner.nextInt();
			switch (number) {
			case 1:
				studentCount = add(studentId, studentName, studentScore,studentCount);
				System.out.println("��ӳɹ�");
				break;
			case 2:
				display(studentId, studentName, studentScore, studentCount);
				break;
			case 3:
				studentCount = delete(studentId, studentName, studentScore,
						studentCount);
				break;
			case 4:
				update(studentId, studentName, studentScore, studentCount);
				break;
			case 5:
				select(studentId, studentName, studentScore, studentCount);
				break;
			case 6:
				Sort(studentId, studentName, studentScore, studentCount);
				break;
			case 7:
				System.exit(0);
				break;
			default:
				System.out.println("������1-7֮�������");
			}
		}
	}

	// 1.���ѧ����Ϣ��
	public static Integer add(Integer[] studentId, String[] studentName,
			Integer[] studentScore, int studentCount) {
		System.out.println("������ѧ��ѧ��");
		Scanner s1 = new Scanner(System.in);
		studentId[studentCount] = s1.nextInt();
		System.out.println("������ѧ������");
		Scanner s2 = new Scanner(System.in);
		studentName[studentCount] = s2.next();
		System.out.println("������ѧ���ɼ�");
		Scanner s3 = new Scanner(System.in);
		studentScore[studentCount] = s3.nextInt();
		studentCount++;
		return studentCount;
	}

	// 2.��ʾѧ����Ϣ��
	public static void display(Integer[] studentId, String[] studentName,
			Integer[] studentScore, int studentCount) {
		String str = "ѧ��"+"\t����"+"\t�ɼ�\n";
		for(int i = 0; i < studentCount; i++){
			str = studentId[i] + "\t" + studentName[i] + "\t"
					+ studentScore[i] + "\n";
		}
	}
	
	// 3.ɾ��ѧ����Ϣ
		public static int delete(Integer[] studentId, String[] studentName,
				Integer[] studentScore, int studentCount) {
			Integer temp = select(studentId,studentName,studentScore,studentCount);
			System.out.println("�Ƿ�ȷ��Ҫɾ��������Ϣ���ǣ�ѡ1����ѡ0");
			Scanner s = new Scanner(System.in);
			int j = s.nextInt();
			switch(j){
			case 0:
				System.out.println("����ȡ����ɾ������");
				break;
			case 1:
				for(int i=0;i<studentCount;i++){
					if(studentName.equals(studentName[i])){
						if(i<studentCount-1){
							studentId[i] = studentId[i+1];
							studentName[i] = studentName[i+1];
							studentScore[i] = studentScore[i+1];
						}
						studentId[i] = null;
						studentName[i] = null;
						studentScore[i] = null;
						return studentCount--;
					}
						
				}
			}
			return studentCount;
		}
		
		// 4.�޸�ѧ����Ϣ��
		public static void update(Integer[] studentId, String[] studentName,
				Integer[] studentScore, int studentCount) {
			Integer temp = select(studentId, studentName, studentScore, studentCount);
			if(temp == null){
				System.out.println("���������Ϣ��������������");
			}else{
				System.out.println("����������ѧ��");
				Scanner s1 = new Scanner(System.in);
				studentId[temp] = s1.nextInt();
				System.out.println("��������������");
				Scanner s2 = new Scanner(System.in);
				studentName[temp] = s2.next();
				System.out.println("�������������");
				Scanner s3 = new Scanner(System.in);
				studentScore[temp] = s3.nextInt();
				System.out.println("�޸����");
				
			}
		}

	// 5.��ѯѧ����Ϣ��
	public static Integer select(Integer[] studentId, String[] studentName,
			Integer[] studentScore, int studentCount) {
		System.out.println("������ѧ������");
		Scanner s = new Scanner(System.in);
		String str = s.next();
		for (int i = 0; i < studentCount; i++) {
			if (str.equals(studentName[i]))
				System.out.println("ѧ��"+"\t����"+"\t�ɼ�");
				System.out.println(studentId[i] + "\t" + studentName[i] + "\t"
					+ studentScore[i]);
				return studentId[i];
		}
		return null;
		
	}

	

	

	// 6.�����
	public static void Sort(Integer[] studentId, String[] studentName,
			Integer[] studentScore, int studentCount) {
		System.out.println("��ѡ�����򷽷�:1.��ѧ������\t2.���ɼ�����");
		Scanner s1 = new Scanner(System.in);
		int number = s1.nextInt();
		switch (number) {
		case 1:
			for (int i = 0; i < studentCount; i++) {
				for (int j = 0; j < studentCount - 1 - i; j++) {
					if (studentId[j] > studentId[j + 1]) {
						int tp = studentId[j];
						studentId[j] = studentId[j + 1];
						studentId[j + 1] = tp;

						tp = studentScore[j];
						studentScore[j] = studentScore[j + 1];
						studentScore[j + 1] = tp;

						String tp1 = studentName[j];
						studentName[j] = studentName[j + 1];
						studentName[j + 1] = tp1;
					}
				}
			}
			display(studentId, studentName, studentScore, studentCount);
			break;

		case 2:
			for (int i = 0; i < studentCount; i++) {
				for (int j = 0; j < studentCount - 1 - i; j++) {
					if (studentScore[j] > studentScore[j + 1]) {
						int tp = studentScore[j];
						studentScore[j] = studentScore[j + 1];
						studentScore[j + 1] = tp;

						tp = studentId[j];
						studentId[j] = studentId[j + 1];
						studentId[j + 1] = tp;

						String tp1 = studentName[j];
						studentName[j] = studentName[j + 1];
						studentName[j + 1] = tp1;
					}
				}
			}
			display(studentId, studentName, studentScore, studentCount);
			break;
		default:
			System.out.println("������1����2");
		}

	}
}