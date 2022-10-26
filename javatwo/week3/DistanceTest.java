package week3;

import java.util.Scanner;

public class DistanceTest {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("생성하고자 하는 객체의 수를 입력하세요: ");
		int num = in.nextInt();
		
		Distance[] distance = new Distance[num];
		
		String name = " ";
		int dist = 0;
		for(int i = 0 ; i < distance.length ; i++) {
			System.out.print(">> 이름과 통학거리를 입력하세요: ");
			name = in.next();
			dist = in.nextInt();
			distance[i] = new Distance(name, dist);
		}
		
		//longdistance(distance);
		//shortdistance(distance);

		System.out.println("\n통학거리가 가장 긴 학생: "+distance[longdistance(distance)]);
		System.out.println("통학거리가 가장 짧은 학생: "+distance[shortdistance(distance)]);
		
		int sub = distance[longdistance(distance)].getDist() - distance[shortdistance(distance)].getDist();
		System.out.println("통학거리가 가장 긴 학생과 짤은 학생의 차이는"+sub+"입니다");
		
		
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
		System.out.println("통학거리가 가장 긴 학생: "+dist[num]);
	}
	public static void shortdistance(Distance[] dist) {
		int num = 0;
		int min = 100000;
		for(int i = 0 ; i < dist.length ; i++) {
			if(dist[i].getDist() < min) {
				num = i;
			}
		}
		System.out.println("통학거리가 가장 짧은 학생: "+dist[num]);
	}*/
}
