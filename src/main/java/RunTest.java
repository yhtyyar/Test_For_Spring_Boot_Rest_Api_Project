import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static util.Utils.*;

@Slf4j
public class RunTest {


    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", PATH_TO_DRIVER);

        ChromeOptions options = new ChromeOptions();
        options.setBinary(PATH_TO_CHROME);

        WebDriver driver = new ChromeDriver(options);

        driver.get(PATH_TO_OVERLORDS);


        // проверка заголовка Overlords
        WebElement element = waitingForAnItem(driver.findElement(By.xpath("/html/body/h1")));

        if (element.getText().equals(TITLE_OVERLORD)) {
            System.out.println("Overlords. Правильное заглавие");
        } else {
            System.out.println("Overlords. Ошибка! Неправильное заглавие");
        }


        // проверка заголовка первого объекта Overlords
        element = waitingForAnItem(driver.findElement(By.xpath("/html/body/fieldset[1]/legend/h3")));

        if (element.getText().equals(HEADING_FOR_FIRST_OBJECT_OVERLORD)) {
            System.out.println("Overlords.Правильное заглавие первого объекта");
        } else {
            System.out.println("Overlords.Ошибка! Неправильное заглавие первого объекта");
        }


        // проверка отображения текста в первом объекте когда нет Повелителей в БД Overlords
        element = waitingForAnItem(driver.findElement(By.xpath("/html/body/fieldset[1]/h4")));

        if (element.getText().equals(TEXT_FOR_FIRST_OBJECT_OVERLORD)) {
            System.out.println("Overlords. Правильный текст первого объекта");
        } else {
            System.out.println("Overlords. Ошибка! Неправильное текст первого объекта");
        }


        // проверка добавления Повелителя Overlords
        element = waitingForAnItem(driver.findElement(By.xpath("/html/body/fieldset[2]/form/label[1]/input")));
        element.sendKeys(NAME_FOR_FIRST_OVERLORD);

        element = waitingForAnItem(driver.findElement(By.xpath("/html/body/fieldset[2]/form/label[2]/input")));
        element.sendKeys(AGE_FOR_FIRST_OVERLORD + "");

        element = waitingForAnItem(driver.findElement(By.xpath("/html/body/fieldset[2]/form/input")));
        element.click();

        element = waitingForAnItem(driver.findElement(By.xpath("/html/body/fieldset[1]/div[1]/h4")));

        if (element.getText().equals(DISPLAY_OF_THE_FIRST_OVERLORD)) {
            System.out.println("Overlords. Создание Повелителей срабатывает правильно");
        } else {
            System.out.println("Overlords. Ошибка! Создание Повелителей не работает");
        }


        // Добавляем ещё 14 Повелителей Overlords
        // второй Повелителей
        element = waitingForAnItem(driver.findElement(By.xpath("/html/body/fieldset[2]/form/label[1]/input")));
        element.sendKeys(NAME_FOR_SECOND_OVERLORD);

        element = waitingForAnItem(driver.findElement(By.xpath("/html/body/fieldset[2]/form/label[2]/input")));
        element.sendKeys(AGE_FOR_SECOND_OVERLORD + "");

        element = waitingForAnItem(driver.findElement(By.xpath("/html/body/fieldset[2]/form/input")));
        element.click();


        // третий Повелителей
        element = waitingForAnItem(driver.findElement(By.xpath("/html/body/fieldset[2]/form/label[1]/input")));
        element.sendKeys(NAME_FOR_THIRD_OVERLORD);

        element = waitingForAnItem(driver.findElement(By.xpath("/html/body/fieldset[2]/form/label[2]/input")));
        element.sendKeys(AGE_FOR_THIRD_OVERLORD + "");

        element = waitingForAnItem(driver.findElement(By.xpath("/html/body/fieldset[2]/form/input")));
        element.click();


        // четвертый Повелителей
        element = waitingForAnItem(driver.findElement(By.xpath("/html/body/fieldset[2]/form/label[1]/input")));
        element.sendKeys(NAME_FOR_FOURTH_OVERLORD);

        element = waitingForAnItem(driver.findElement(By.xpath("/html/body/fieldset[2]/form/label[2]/input")));
        element.sendKeys(AGE_FOR_FOURTH_OVERLORD + "");

        element = waitingForAnItem(driver.findElement(By.xpath("/html/body/fieldset[2]/form/input")));
        element.click();


        // пятый Повелителей
        element = waitingForAnItem(driver.findElement(By.xpath("/html/body/fieldset[2]/form/label[1]/input")));
        element.sendKeys(NAME_FOR_FIFTH_OVERLORD);

        element = waitingForAnItem(driver.findElement(By.xpath("/html/body/fieldset[2]/form/label[2]/input")));
        element.sendKeys(AGE_FOR_FIFTH_OVERLORD + "");

        element = waitingForAnItem(driver.findElement(By.xpath("/html/body/fieldset[2]/form/input")));
        element.click();


        // шестой Повелителей
        element = waitingForAnItem(driver.findElement(By.xpath("/html/body/fieldset[2]/form/label[1]/input")));
        element.sendKeys(NAME_FOR_SIXTH_OVERLORD);

        element = waitingForAnItem(driver.findElement(By.xpath("/html/body/fieldset[2]/form/label[2]/input")));
        element.sendKeys(AGE_FOR_SIXTH_OVERLORD + "");

        element = waitingForAnItem(driver.findElement(By.xpath("/html/body/fieldset[2]/form/input")));
        element.click();


        // седьмой Повелителей
        element = waitingForAnItem(driver.findElement(By.xpath("/html/body/fieldset[2]/form/label[1]/input")));
        element.sendKeys(NAME_FOR_SEVENTH_OVERLORD);

        element = waitingForAnItem(driver.findElement(By.xpath("/html/body/fieldset[2]/form/label[2]/input")));
        element.sendKeys(AGE_FOR_SEVENTH_OVERLORD + "");

        element = waitingForAnItem(driver.findElement(By.xpath("/html/body/fieldset[2]/form/input")));
        element.click();


        // восьмой Повелителей
        element = waitingForAnItem(driver.findElement(By.xpath("/html/body/fieldset[2]/form/label[1]/input")));
        element.sendKeys(NAME_FOR_EIGHTH_OVERLORD);

        element = waitingForAnItem(driver.findElement(By.xpath("/html/body/fieldset[2]/form/label[2]/input")));
        element.sendKeys(AGE_FOR_EIGHTH_OVERLORD + "");

        element = waitingForAnItem(driver.findElement(By.xpath("/html/body/fieldset[2]/form/input")));
        element.click();


        // девятый Повелителей
        element = waitingForAnItem(driver.findElement(By.xpath("/html/body/fieldset[2]/form/label[1]/input")));
        element.sendKeys(NAME_FOR_NINTH_OVERLORD);

        element = waitingForAnItem(driver.findElement(By.xpath("/html/body/fieldset[2]/form/label[2]/input")));
        element.sendKeys(AGE_FOR_NINTH_OVERLORD + "");

        element = waitingForAnItem(driver.findElement(By.xpath("/html/body/fieldset[2]/form/input")));
        element.click();


        // десятый Повелителей
        element = waitingForAnItem(driver.findElement(By.xpath("/html/body/fieldset[2]/form/label[1]/input")));
        element.sendKeys(NAME_FOR_TENTH_OVERLORD);

        element = waitingForAnItem(driver.findElement(By.xpath("/html/body/fieldset[2]/form/label[2]/input")));
        element.sendKeys(AGE_FOR_TENTH_OVERLORD + "");

        element = waitingForAnItem(driver.findElement(By.xpath("/html/body/fieldset[2]/form/input")));
        element.click();


        // одинацатый Повелителей
        element = waitingForAnItem(driver.findElement(By.xpath("/html/body/fieldset[2]/form/label[1]/input")));
        element.sendKeys(NAME_FOR_ELEVENTH_OVERLORD);

        element = waitingForAnItem(driver.findElement(By.xpath("/html/body/fieldset[2]/form/label[2]/input")));
        element.sendKeys(AGE_FOR_ELEVENTH_OVERLORD + "");

        element = waitingForAnItem(driver.findElement(By.xpath("/html/body/fieldset[2]/form/input")));
        element.click();


        // двенацатый Повелителей
        element = waitingForAnItem(driver.findElement(By.xpath("/html/body/fieldset[2]/form/label[1]/input")));
        element.sendKeys(NAME_FOR_TWELFTH_OVERLORD);

        element = waitingForAnItem(driver.findElement(By.xpath("/html/body/fieldset[2]/form/label[2]/input")));
        element.sendKeys(AGE_FOR_TWELFTH_OVERLORD + "");

        element = waitingForAnItem(driver.findElement(By.xpath("/html/body/fieldset[2]/form/input")));
        element.click();


        // тринадцатый Повелителей
        element = waitingForAnItem(driver.findElement(By.xpath("/html/body/fieldset[2]/form/label[1]/input")));
        element.sendKeys(NAME_FOR_THIRTEENTH_OVERLORD);

        element = waitingForAnItem(driver.findElement(By.xpath("/html/body/fieldset[2]/form/label[2]/input")));
        element.sendKeys(AGE_FOR_THIRTEENTH_OVERLORD + "");

        element = waitingForAnItem(driver.findElement(By.xpath("/html/body/fieldset[2]/form/input")));
        element.click();


        // четырнадцатый Повелителей
        element = waitingForAnItem(driver.findElement(By.xpath("/html/body/fieldset[2]/form/label[1]/input")));
        element.sendKeys(NAME_FOR_FOURTEENTH_OVERLORD);

        element = waitingForAnItem(driver.findElement(By.xpath("/html/body/fieldset[2]/form/label[2]/input")));
        element.sendKeys(AGE_FOR_FOURTEENTH_OVERLORD + "");

        element = waitingForAnItem(driver.findElement(By.xpath("/html/body/fieldset[2]/form/input")));
        element.click();


        // пятнадцатый Повелителей
        element = waitingForAnItem(driver.findElement(By.xpath("/html/body/fieldset[2]/form/label[1]/input")));
        element.sendKeys(NAME_FOR_FIFTEENTH_OVERLORD);

        element = waitingForAnItem(driver.findElement(By.xpath("/html/body/fieldset[2]/form/label[2]/input")));
        element.sendKeys(AGE_FOR_FIFTEENTH_OVERLORD + "");

        element = waitingForAnItem(driver.findElement(By.xpath("/html/body/fieldset[2]/form/input")));
        element.click();


        // проверка метода выводящиего топ-10 самых молодых Повелителей Overlords
        element = waitingForAnItem(driver.findElement(By.xpath("/html/body/fieldset[4]/form/input")));
        element.click();

        element = waitingForAnItem(driver.findElement(By.xpath("/html/body/fieldset/div[1]/h4")));

        if (element.getText().equals(FIRST_YOUNG_OVERLORD)) {
            System.out.println("Overlords. Самый молодой Повелитель определен правильно");
        } else {
            System.out.println("Overlords. Ошибка! Фильтр не работает.");
        }


        // возвращаемся обратно на главную страницу  Overlords
        element = waitingForAnItem(driver.findElement(By.xpath("/html/body/form/input")));
        element.click();
        System.out.println("Overlords. Переход на главную страницу");


        // переходим к Планетам из  Overlords
        element = waitingForAnItem(driver.findElement(By.xpath("/html/body/form/input")));
        element.click();


        // протестируем страницу Планет
        // проверка заголовка Planets
        element = waitingForAnItem(driver.findElement(By.xpath("/html/body/h1")));

        if (element.getText().equals(TITLE_PLANET)) {
            System.out.println("Planets. Правильное заглавие");
        } else {
            System.out.println("Planets. Ошибка! Неправильное заглавие");
        }


        // проверка заголовка первого объекта  Planets
        element = waitingForAnItem(driver.findElement(By.xpath("/html/body/fieldset[1]/legend/h3")));

        if (element.getText().equals(HEADING_FOR_FIRST_OBJECT_PLANET)) {
            System.out.println("Planets. Правильное заглавие первого объекта");
        } else {
            System.out.println("Planets. Ошибка! Неправильное заглавие первого объекта");
        }


        // проверка отображения текста в первом объекте когда нет Планет в БД Planets
        element = waitingForAnItem(driver.findElement(By.xpath("/html/body/fieldset[1]/h4")));

        if (element.getText().equals(TEXT_FOR_FIRST_OBJECT_PLANET)) {
            System.out.println("Planets. Правильный текст первого объекта");
        } else {
            System.out.println("Planets. Ошибка! Неправильное текст первого объекта");
        }


        // проверка добавления Планет  Planets
        element = waitingForAnItem(driver.findElement(By.xpath("/html/body/fieldset[2]/form/label/input")));
        element.sendKeys(NAME_FOR_FIRST_PLANET);

        element = waitingForAnItem(driver.findElement(By.xpath("/html/body/fieldset[2]/form/input")));
        element.click();

        element = waitingForAnItem(driver.findElement(By.xpath("/html/body/fieldset[1]/div[1]/h4")));

        if (element.getText().equals(DISPLAY_OF_THE_FIRST_PLANET)) {
            System.out.println("Planets. Создание Планет срабатывает правильно");
        } else {
            System.out.println("Planets. Ошибка! Создание Планет не работает");
        }


        // Добавляем ещё 7 Планет Planets
        // вторая Планета
        element = waitingForAnItem(driver.findElement(By.xpath("/html/body/fieldset[2]/form/label/input")));
        element.sendKeys(NAME_FOR_SECOND_PLANET);

        element = waitingForAnItem(driver.findElement(By.xpath("/html/body/fieldset[2]/form/input")));
        element.click();


        // третья Планета
        element = waitingForAnItem(driver.findElement(By.xpath("/html/body/fieldset[2]/form/label/input")));
        element.sendKeys(NAME_FOR_THIRD_PLANET);

        element = waitingForAnItem(driver.findElement(By.xpath("/html/body/fieldset[2]/form/input")));
        element.click();


        // четвертая Планета
        element = waitingForAnItem(driver.findElement(By.xpath("/html/body/fieldset[2]/form/label/input")));
        element.sendKeys(NAME_FOR_FOURTH_PLANET);

        element = waitingForAnItem(driver.findElement(By.xpath("/html/body/fieldset[2]/form/input")));
        element.click();


        // пятая Планета
        element = waitingForAnItem(driver.findElement(By.xpath("/html/body/fieldset[2]/form/label/input")));
        element.sendKeys(NAME_FOR_FIFTH_PLANET);

        element = waitingForAnItem(driver.findElement(By.xpath("/html/body/fieldset[2]/form/input")));
        element.click();


        // шестая Планета
        element = waitingForAnItem(driver.findElement(By.xpath("/html/body/fieldset[2]/form/label/input")));
        element.sendKeys(NAME_FOR_SIXTH_PLANET);

        element = waitingForAnItem(driver.findElement(By.xpath("/html/body/fieldset[2]/form/input")));
        element.click();


        // седьмая Планета
        element = waitingForAnItem(driver.findElement(By.xpath("/html/body/fieldset[2]/form/label/input")));
        element.sendKeys(NAME_FOR_SEVENTH_PLANET);

        element = waitingForAnItem(driver.findElement(By.xpath("/html/body/fieldset[2]/form/input")));
        element.click();


        // восьмая Планета
        element = waitingForAnItem(driver.findElement(By.xpath("/html/body/fieldset[2]/form/label/input")));
        element.sendKeys(NAME_FOR_EIGHTH_PLANET);

        element = waitingForAnItem(driver.findElement(By.xpath("/html/body/fieldset[2]/form/input")));
        element.click();


        // проверка удаление Планет Planets
        element = waitingForAnItem(driver.findElement(By.xpath("/html/body/fieldset[1]/div[8]/form/input")));
        element.click();

        try {
            element = driver.findElement(By.xpath("/html/body/fieldset[1]/div[8]"));
            System.out.println("Planets. Ошибка! Удаление не получилось " + element.getText());
        } catch (NoSuchElementException e) {
            System.out.println("Planets. Удаление произошло правильно.");
        }


        // переходим обратно к Повелителям из страницы Планет Planets
        element = waitingForAnItem(driver.findElement(By.xpath("/html/body/form/input")));
        element.click();


        // Проверяем назначения Повелителей к Планетам
        element = waitingForAnItem(driver.findElement(By.xpath("/html/body/fieldset[1]/div[1]/form/label/input")));
        element.sendKeys(1 + "");

        element = waitingForAnItem(driver.findElement(By.xpath("/html/body/fieldset[1]/div[1]/form/input")));
        element.click();

        element = waitingForAnItem(driver.findElement(By.xpath("/html/body/fieldset[1]/div[1]/h4")));

        if (element.getText().equals(DISPLAY_OF_THE_FIRST_OVERLORD_AFTER_UPDATE)) {
            System.out.println("Overlords. Проверка назначения Повелителей к Планетам работает правильно");
        } else {
            System.out.println("Overlords. Ошибка! Проверка назначения Повелителей к Планетам неработает");
        }


        // Проверяем метод выводящий всех Повелителей бездельников Overlords
        element = waitingForAnItem(driver.findElement(By.xpath("/html/body/fieldset[3]/form/input")));
        element.click();

        element = waitingForAnItem(driver.findElement(By.xpath("/html/body/fieldset/div[1]/h4")));

        if (element.getText().equals(DISPLAY_OF_THE_FIRST_OVERLORD_AFTER_UPDATE)) {
            System.out.println("Overlords-idlers. Ошибка! Метод выводящий всех Повелителей бездельников не работает");
        } else {
            System.out.println("Overlords-idlers. Метод выводящий всех Повелителей бездельников работает правильно");
        }


        // Проверка назначения Повелителей к Планетам в странице overlords-idlers
        element = waitingForAnItem(driver.findElement(By.xpath("/html/body/fieldset/div[1]/form/label/input")));
        element.sendKeys(2 + "");

        element = waitingForAnItem(driver.findElement(By.xpath("/html/body/fieldset/div[1]/form/input")));
        element.click();

        element = waitingForAnItem(driver.findElement(By.xpath("/html/body/fieldset/div[1]/h4")));

        if (element.getText().equals(DISPLAY_OF_THE_SECOND_OVERLORD_AFTER_UPDATE)) {
            System.out.println("Overlords-idlers. Ошибка! Проверка назначения Повелителей к Планетам неработает");
        } else {
            System.out.println("Overlords-idlers. Проверка назначения Повелителей к Планетам работает правильно");
        }


        // Возвращаемся обратно на главную страницу Overlords
        element = waitingForAnItem(driver.findElement(By.xpath("/html/body/form/input")));
        element.click();
        System.out.println("Overlords. Переход на главную страницу");


        // Проверка добавленной Планеты  Overlords
        element = waitingForAnItem(driver.findElement(By.xpath("/html/body/fieldset[1]/div[2]/h4")));

        if (element.getText().equals(DISPLAY_OF_THE_SECOND_OVERLORD_AFTER_UPDATE)) {
            System.out.println("Overlords. Проверка назначения Повелителей к Планетам работает правильно");
        } else {
            System.out.println("Overlords. Ошибка! Проверка назначения Повелителей к Планетам неработает");
        }
    }

    public static WebElement waitingForAnItem(WebElement element) throws InterruptedException {
        try {
            return element;
        } catch (NoSuchElementException e) {
            Thread.sleep(1000);
            return waitingForAnItem(element);
        }
    }
}
