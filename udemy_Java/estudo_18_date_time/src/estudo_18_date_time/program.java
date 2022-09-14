package estudo_18_date_time;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		// fmt1 é uma máscara para utilizar com o parse
		// os códigos da mascára estão na documentação

		System.out.println("Trabalhando com data e hora");
		LocalDate d01 = LocalDate.now();
		LocalDateTime d02 = LocalDateTime.now();
		Instant d03 = Instant.now(); // formato UTC

		LocalDate d04 = LocalDate.parse("2022-07-20");
		LocalDateTime d05 = LocalDateTime.parse("2022-07-20T14:30:25");
		Instant d06 = Instant.parse("2022-07-20T01:30:25Z");
		Instant d07 = Instant.parse("2022-07-20T14:30:25-03:00");

		LocalDate d08 = LocalDate.parse("20/07/2022", fmt1);
		LocalDateTime d09 = LocalDateTime.parse("20/07/2022 01:30", fmt2);
		LocalDate d10 = LocalDate.of(2022, 7, 20);
		LocalDateTime d11 = LocalDateTime.of(2022, 7, 20, 11, 30);

		// formatando a exibição de data
		System.out.println("------------------------------------------------------");
		System.out.println("DateTimeFormatter.ofPattern(\"dd/MM/yyyy\")");
		DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println("d04 = " + d04.toString());
		System.out.println("d04 formatado:" + d04.format(fmt3));
		System.out.println("d04 formatado:" + fmt3.format(d04));
		System.out.println("d04 formatado:" + d04.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		
		System.out.println("------------------------------------------------------");
		System.out.println("DateTimeFormatter.ofPattern(\"dd/MM/yyyy HH:mm\")");
		DateTimeFormatter fmt4 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		System.out.println("d05 = " + d05.toString());
		System.out.println("d05 formatado:" + d05.format(fmt3));
		System.out.println("d05 formatado:" + d05.format(fmt4));
		
		System.out.println("------------------------------------------------------");
		// para formatar um objeto instant é necessário especificar o fuso horário no
		// formatador
		System.out.println("DateTimeFormatter.ofPattern(\"dd/MM/yyyy HH:mm\").withZone(ZoneId.systemDefault())");
		DateTimeFormatter fmt5 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
		System.out.println("d06 = " + d06.toString());
		System.out.println("d06 formatado = " + fmt5.format(d06));

		System.out.println("------------------------------------------------------");
		System.out.println("DateTimeFormatter.ISO_DATE_TIME");
		DateTimeFormatter fmt6 = DateTimeFormatter.ISO_DATE_TIME;
		System.out.println("d05 = " + d05.toString());
		System.out.println("d05 formatado:" + d05.format(fmt6));
		System.out.println("d05 formatado:" + d05.format(fmt6));

		System.out.println("------------------------------------------------------");
		System.out.println("DateTimeFormatter.ISO_INSTANT");
		DateTimeFormatter fmt7 = DateTimeFormatter.ISO_INSTANT;
		System.out.println("d06 = " + d06.toString());
		System.out.println("d06 formatado = " + fmt7.format(d06));

		System.out.println("------------------------------------------------------");
		System.out.println("d01 = " + d01.toString());
		System.out.println("d02 = " + d02.toString());
		System.out.println("d03 = " + d03.toString());
		System.out.println("d04 = " + d04.toString());
		System.out.println("d05 = " + d05.toString());
		System.out.println("d06 = " + d06.toString());
		System.out.println("d07 = " + d07.toString()); // apresenta o horário em londres GMT
		System.out.println("d08 = " + d08.toString());
		System.out.println("d09 = " + d09.toString());
		System.out.println("d10 = " + d10.toString());
		System.out.println("d11 = " + d11.toString());
		
		System.out.println("------------------------------------------------------");
//		System.out.println("Time Zones Ids");
//		for(String s : ZoneId.getAvailableZoneIds()) {
//			System.out.println(s);
//		}

		LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault());
		System.out.println("LocalDate");
		System.out.println("d06 = " + d06.toString());
		System.out.println("r1 sys default = " + r1.toString());
		LocalDate r2 = LocalDate.ofInstant(d06, ZoneId.of("Portugal"));
		System.out.println("r2 portugal = " + r2.toString());
		
		System.out.println("------------------------------------------------------");
		System.out.println("LocalDateTime");
		LocalDateTime r3 = LocalDateTime.ofInstant(d06, ZoneId.systemDefault());
		System.out.println("d06 = " + d06.toString());
		System.out.println("r3 sys default = " + r3.toString());
		LocalDateTime r4 = LocalDateTime.ofInstant(d06, ZoneId.of("Portugal"));
		System.out.println("r4 portugal = " + r4.toString());
		
		System.out.println("------------------------------------------------------");
		System.out.println("getting LocalDateTime attibutes");
		System.out.println("data 05 = " + d05.toString());
		System.out.println("data 05 dia = " + d05.getDayOfMonth());
		System.out.println("data 05 mês = " + d05.getMonthValue());
		System.out.println("data 05 ano = " + d05.getYear());
		System.out.println("data 05 hora = " + d05.getHour());
		System.out.println("data 05 minutos = " + d05.getMinute());
		
		System.out.println("------------------------------------------------------");
		System.out.println("adding/subtracting dates");
		LocalDateTime d05PastWeek = d05.minusDays(7);
		LocalDateTime d05NextWeek = d05.plusDays(7);
		System.out.println("d05 = " + d05.toString());
		System.out.println("d05 last week= " + d05PastWeek.toString());
		System.out.println("d05 next week = " + d05NextWeek.toString());
		System.out.println("Duration");
		Duration t1 = Duration.between(d05PastWeek, d05);
		System.out.println("t1 [days] = "+t1.toDays());
		
		System.out.println("------------------------------------------------------");
		System.out.println("adding/subtracting dates");
		LocalDate d04PastWeek = d04.minusDays(7);
		LocalDate d04NextWeek = d04.plusDays(7);
		System.out.println("d04 = " + d04.toString());
		System.out.println("d04 last week= " + d04PastWeek.toString());
		System.out.println("d04 next week = " + d04NextWeek.toString());
		// duration.between utiliza objetos localdatetime 
		Duration t2 = Duration.between(d04PastWeek.atStartOfDay(), d04NextWeek.atTime(0,0));
		System.out.println("t2 [days] = "+t2.toDays());
		
	}
}
