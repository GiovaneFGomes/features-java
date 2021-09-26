package br.com.giovane.java14.switchcase;

public class SwitchExpressions {

    public enum DAY_WEEK { MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY }


    // Switch Case traditional - below Java 12
    public static String switchTraditional(DAY_WEEK day){
        String result = null;

        switch (day){
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
            case FRIDAY:
                result = "Weekday";
                break;
            case SATURDAY:
            case SUNDAY:
                result = "Weekend";
                break;
            default: result = "Invalid day";
        }
        return result;
    }


    // Switch Case using yield instead of break
    public static String switchTExpression1(DAY_WEEK day){
       return switch (day){
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
            case FRIDAY:
                yield "Weekday";
            case SATURDAY:
            case SUNDAY:
                 yield "Weekend";
        };
    }


    // Switch Case using lambda expressions: "case L ->"
    public static String switchExpression2(DAY_WEEK day){
        return switch (day) {
            case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY -> "Weekday";
            case SATURDAY, SUNDAY -> "Weekend";
        };

    }


    // Switch Case when a block is needed
    public static int switchExpressions3(String str){
        return switch (str) {
            case "A" -> 1;
            case "B" -> 2;
            case "C" -> {
                System.out.println("Return three");
                yield 3; // return a value
            }
            default -> throw new IllegalStateException("Unexpected value: " + str);
        };
    }


    public static void main(String[] args) {
        System.out.println(switchTExpression1(DAY_WEEK.MONDAY));
        System.out.println(switchExpression2(DAY_WEEK.FRIDAY));
        System.out.println(switchExpressions3("C"));
        System.out.println(switchTraditional(DAY_WEEK.SATURDAY));
    }

}

// Features of Switch Expressions

// 1. Can be used as an expression
// 2. No need for break statements
// 3. Arrow syntax (Lambda-like syntax)
// 4. Multiple cases per line
// 5. Yield keyword to replace break when returning a value





