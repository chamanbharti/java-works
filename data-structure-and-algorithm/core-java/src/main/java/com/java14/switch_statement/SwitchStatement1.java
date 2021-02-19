package java14.switch_statement;

import java.time.LocalDate;
import java.time.Month;

public class SwitchStatement1 {

	public static void main(String[] args) {
	      showQuarter(LocalDate.now().getMonth());
	  }
	
	//traditional way
	public static void showQuarter(Month month) {
        switch (month) {
            case JANUARY:
            case FEBRUARY:
            case MARCH:
                System.out.println("First Quarter");
                break;
            case APRIL:
            case MAY:
            case JUNE:
                System.out.println("Second Quarter");
                break;
            case JULY:
            case AUGUST:
            case SEPTEMBER:
                System.out.println("Third Quarter");
                break;
            case OCTOBER:
            case NOVEMBER:
            case DECEMBER:
                System.out.println("Forth Quarter");
            default:
                System.out.println("Unknown Quarter");
        }
    }
	//jdk 12
//	  public static void showQuarter(Month month) {
//	      switch (month) {
//	          case JANUARY, FEBRUARY, MARCH -> System.out.println("First Quarter");//no break needed
//	          case APRIL, MAY, JUNE -> System.out.println("Second Quarter");
//	          case JULY, AUGUST, SEPTEMBER -> System.out.println("Third Quarter");
//	          case OCTOBER, NOVEMBER, DECEMBER -> System.out.println("Forth Quarter");
//	          default -> System.out.println("Unknown Quarter");
//	      }
//	  }
	
//	 public static void showQuarter(Month month) {
//	  String quarter = switch (month) {
//	          case JANUARY, FEBRUARY, MARCH -> "First Quarter";//must be a single returning value
//	          case APRIL, MAY, JUNE -> "Second Quarter";
//	          case JULY, AUGUST, SEPTEMBER -> "Third Quarter";
//	          case OCTOBER, NOVEMBER, DECEMBER -> "Forth Quarter";
//	          default -> "Unknown Quarter";
//	      };
//	      System.out.println(quarter);
//	  }
//	public static void showQuarter(Month month) {
//
//	      String result = switch (month) {
//	          case JANUARY,
//	                  FEBRUARY,
//	                  MARCH -> {
//	              //multiple statements can be used here
//	              yield "First Quarter";
//	          }
//	          case APRIL, MAY, JUNE -> {
//	              //multiple statements can be used here
//	              yield "Second Quarter";
//	          }
//	          case JULY, AUGUST, SEPTEMBER -> "Third Quarter";
//	          case OCTOBER, NOVEMBER, DECEMBER -> {
//	              //multiple statements can be used here
//	              yield "Forth Quarter";
//	          }
//	          default -> "Unknown Quarter";
//	      };
//	      System.out.println(result);
//	  }	
//	public static void showQuarter(Month month) {
//
//	      String result = switch (month) {
//	          case JANUARY:
//	          case FEBRUARY:
//	          case MARCH:
//	              //multiple statements can be used here
//	              yield "First Quarter";
//	          case APRIL:
//	          case MAY:
//	          case JUNE:
//	              //multiple statements can be used here
//	              yield "Second Quarter";
//	          case JULY:
//	          case AUGUST:
//	          case SEPTEMBER:
//	              //multiple statements can be used here
//	              yield "Third Quarter";
//	          case OCTOBER:
//	          case NOVEMBER:
//	          case DECEMBER:
//	              //multiple statements can be used here
//	              yield "Forth Quarter";
//	          default:
//	              yield "Unknown Quarter";
//	      };
//	      System.out.println(result);
//	  }
}
