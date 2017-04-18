package com.java.main;

import java.util.Calendar;

public class CalendarEx6 {
	public static void main(String[] args) {
		if(args.length !=2){
			System.out.println("Usage: java Ca;emdarEx6 2015 9");
			return;
		}
		int year = Integer.parseInt(args[0]);
		int month = Integer.parseInt(args[1]);
		int Start_day_of_week = 0;
		int end_day = 0;
		
		Calendar sday = Calendar.getInstance();
		Calendar eday = Calendar.getInstance();
		
		//추가적 달력
		Calendar past_day = Calendar.getInstance();//과거의 달(월)
		Calendar future_day = Calendar.getInstance();//미래의 달(월)
		
		//System.out.println(sday);
		//System.out.println(sday.get(Calendar.DATE));	
		
		sday.set(year, month-1, 1);//달의 시작 일 설정
		eday.set(year, month, 1);//달의 마지막 일 설정
		
		eday.add(Calendar.DATE, -1);//달의 마지막 일
		
		Start_day_of_week = sday.get(Calendar.DAY_OF_WEEK); // 달의 시작일 위치 1일이 1번째에서 시작
		end_day = eday.get(Calendar.DATE); // 달의 최대 일수 ex>11월이면 30일까지
		System.out.println(Start_day_of_week+" / "+end_day);
		
		past_day.set(year,month,1);
		//past_day.add(Calendar.DATE, Start_day_of_week);
		System.out.println(past_day.get(Calendar.MONTH)+" "+past_day.get(Calendar.DAY_OF_MONTH));
		
		System.out.println("     "+args[0]+"년"+args[1]+"월");
		System.out.println(" su MO TU WE TH FR SA");
		
//		for(int i=1;i<Start_day_of_week;i++){//7
//			System.out.print("   ");
//		}
		//for(int i=)
		
		for(int i=1, n=Start_day_of_week;i<=end_day;i++, n++){//n==7  end_day=30
			System.out.print((i<10)?"  "+i : " "+i);
			if(n%7==0)
				System.out.println();
		}
	}
}