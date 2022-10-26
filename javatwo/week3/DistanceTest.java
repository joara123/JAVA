package week3;

import java.util.Scanner;

public class DistanceTest {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("�����ϰ��� �ϴ� ��ü�� ���� �Է��ϼ���: ");
		int num = in.nextInt();
		
		Distance[] distance = new Distance[num];
		
		String name = " ";
		int dist = 0;
		for(int i = 0 ; i < distance.length ; i++) {
			System.out.print(">> �̸��� ���аŸ��� �Է��ϼ���: ");
			name = in.next();
			dist = in.nextInt();
			distance[i] = new Distance(name, dist);
		}
		
		//longdistance(distance);
		//shortdistance(distance);

		System.out.println("\n���аŸ��� ���� �� �л�: "+distance[longdistance(distance)]);
		System.out.println("���аŸ��� ���� ª�� �л�: "+distance[shortdistance(distance)]);
		
		int sub = distance[longdistance(distance)].getDist() - distance[shortdistance(distance)].getDist();
		System.out.println("���аŸ��� ���� �� �л��� ©�� �л��� ���̴�"+sub+"�Դϴ�");
		
		
	}
	public static int longdistance(Distance[] dist) {
		int num = 0;
		int max = 0;
		for(int i = 0 ; i < dist.length ; i++) {
			if(dist[i].getDist() > max) {
				max = dist[i].getDist();
				num = i;
			}
		}
		return num;
	}
	public static int shortdistance(Distance[] dist) {
		int num = 0;
		int min = 100000;
		for(int i = 0 ; i < dist.length ; i++) {
			if(dist[i].getDist() < min) {
				min = dist[i].getDist();
				num = i;
			}
		}
		return num;
	}
	
	/*
	public static void longdistance(Distance[] dist) {
		int num = 0;
		int max = 0;
		for(int i = 0 ; i < dist.length ; i++) {
			if(dist[i].getDist() > max) {
				num = i;
			}
		}
		System.out.println("���аŸ��� ���� �� �л�: "+dist[num]);
	}
	public static void shortdistance(Distance[] dist) {
		int num = 0;
		int min = 100000;
		for(int i = 0 ; i < dist.length ; i++) {
			if(dist[i].getDist() < min) {
				num = i;
			}
		}
		System.out.println("���аŸ��� ���� ª�� �л�: "+dist[num]);
	}*/
}
