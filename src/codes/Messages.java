package codes;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Messages {
	
	static final DateTimeFormatter TIME_FORMATTER = DateTimeFormatter.ofPattern("HH:mm:ss");
	public static String TIME = LocalDateTime.now().format(TIME_FORMATTER);
	public static String ANNOUNCE_SCORES = "Throw scores: ";
	public static String NUMBER_1_SCORE = "Number 1: %d";
	public static String NUMBER_2_SCORE = "Number 2: %d";
	public static String NUMBER_3_SCORE = "Number 3: %d";
	public static String NUMBER_4_SCORE = "Number 4: %d";
	public static String NUMBER_5_SCORE = "Number 5: %d";
	public static String NUMBER_6_SCORE = "Number 6: %d";
	public static String TOTAL_THROWS = "Total throws: %d + %d + %d + %d + %d + %d = %d";
	public static String THROWING_DIE = "%s -- %s throws die...";
	public static String THREAD_EXCEPTION = "%s -- Exception found in thread %s -- Error: %s";

}
