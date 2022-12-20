package Transport;

import java.time.LocalDate;

public class AutoService {

    public static boolean insDateOK(LocalDate insDate) {
        int numYearNow = LocalDate.now().getYear();
        int numYear = insDate.getYear();
        if (numYear < numYearNow) {
            System.out.println("Страховка просрочена!");
            return false;
        } else if (numYear == numYearNow && LocalDate.now().getDayOfYear() > insDate.getDayOfYear()) {
            System.out.println("Страховка просрочена!");
            return false;
        } else return true;
    }

    public static void checkInsNumber(String numIns){
        if (numIns.length() != 9)
            System.out.println(" !!! "+numIns+" - некорректный номер страховки (должно быть 9 знаков) !!!");
    }
}
