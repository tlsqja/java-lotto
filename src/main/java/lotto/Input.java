package lotto;

import camp.nextstep.edu.missionutils.Console;

import java.util.ArrayList;
import java.util.List;

public class Input {
    Output output = new Output();
    public int buyLotto() {
        System.out.println("구입금액을 입력해 주세요.");
        int purchasedValueReader = 0;

        try{
            purchasedValueReader = Integer.parseInt(Console.readLine());
        }catch (Exception e){
            output.wrongNumberException();
        }

        return purchasedValueReader;
    }


    public int checkHowManyLotto(int purchasedValue){
        if (purchasedValue % 1000 != 0) {
            output.wrongNumberException();
        }

        int lottoCount = purchasedValue / 1000;
        System.out.println("\n" + lottoCount + "개를 구매했습니다.");

        return lottoCount;
    }

    public static void userInputLottoNumber(Lotto userInputLottoNumber, int userInputBonusNumber){
        String userInputLotto;
        String[] userInputLottoTmp;
        List<Integer> numbers = new ArrayList<>();
        System.out.println("\n당첨 번호를 입력해 주세요.");
        userInputLotto = Console.readLine();
        userInputLottoTmp = userInputLotto.split(",");
        for (int i = 0; i < userInputLottoTmp.length; i++) {
              numbers.add(Integer.parseInt(userInputLottoTmp[i]));
        }

        userInputLottoNumber = new Lotto(numbers);

        System.out.println("\n보너스 번호를 입력해 주세요.");
        userInputBonusNumber = Integer.parseInt(Console.readLine());
    }

}
