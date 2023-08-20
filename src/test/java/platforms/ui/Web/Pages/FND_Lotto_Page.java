package platforms.ui.Web.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class FND_Lotto_Page {

    @FindBy(how = How.XPATH, using = "//*[@class='menuContainer']/li[4]")
    public WebElement Buy_In_HomePage;

    @FindBy(how = How.XPATH, using = "(//span[text()='Purchase'])[3]")
    public WebElement Lotto_Purchase;

    @FindBy(how = How.XPATH, using = "//div[text()='Next draw:']")
    public WebElement Next_Draw_Label;

    @FindBy(how = How.XPATH, using = "//a[@class='view-jkpot']")
    public WebElement View_Jackpot_link;

    @FindBy(how = How.XPATH, using = "//button[text()='Done']")
    public WebElement Done_in_View_Jackpots;

    @FindBy(how = How.ID, using = "next")
    public WebElement Next;

    @FindBy(how = How.XPATH, using = "//span[text()=' Buy']")
    public WebElement Buy_in_review_page;

    @FindBy(how = How.XPATH, using = "//div[@aria-label='Select number of boards. Default value is   2']//div//div")
    public WebElement Boards_dropdown;

    @FindBy(how = How.XPATH, using = "//div[text()='4']")
    public WebElement Boards_dropdown_selecting_4;

    @FindBy(how = How.XPATH, using = "(//div[@class='slider round inline-block'])[1]")
    public WebElement Lotto_plus_one_slider;

    @FindBy(how = How.XPATH, using = "//div[@aria-label='LOTTO PLUS 2']")
    public WebElement Lotto_plus_two_slider;

    @FindBy(how = How.XPATH, using = "//div[contains(@aria-label,'Number of draws')]")
    public WebElement Number_of_draws_dropdown;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'4 draws')]")
    public WebElement Draws_4_from_dropdown;

    @FindBy(how = How.XPATH, using = "//div[@class='active lotto-total ']")
    public WebElement Lotto_total_value;

    @FindBy(how = How.XPATH, using = "//div[@class='input-type-div ng-star-inserted']")
    public WebElement Cellphone_no_field;

    @FindBy(how = How.XPATH, using = "(//h4[text()='Review your purchase'])[2]")
    public WebElement Review_your_purchase_header;

    @FindBy(how = How.ID, using = "buy")
    public WebElement Buy_lotto_end_page;

    @FindBy(how = How.XPATH, using = "//span[text()='Ticket requested']")
    public WebElement Ticket_requested_message_After_Buy;

    @FindBy(how = How.ID, using = "game-select-method")
    public WebElement Select_method_dropdown;

    @FindBy(how = How.XPATH, using = "//li[text()=' Pick numbers ']")
    public WebElement Pick_numbers_in_dropdown;

    @FindBy(how = How.XPATH, using = "//span[text()=' 2 ']")
    public WebElement Picking_2;

    @FindBy(how = How.XPATH, using = "//span[text()=' 3 ']")
    public WebElement Picking_3;

    @FindBy(how = How.XPATH, using = "//span[text()=' 4 ']")
    public WebElement Picking_4;

    @FindBy(how = How.XPATH, using = "//span[text()=' 5 ']")
    public WebElement Picking_5;

    @FindBy(how = How.XPATH, using = "//span[text()=' 6 ']")
    public WebElement Picking_6;

    @FindBy(how = How.XPATH, using = "//span[text()=' 7 ']")
    public WebElement Picking_7;

    @FindBy(how = How.XPATH, using = "//ul[@id='B']//span[text()=' 2 ']")
    public WebElement Picking_2_second_board;

    @FindBy(how = How.XPATH, using = "//ul[@id='B']//span[text()=' 3 ']")
    public WebElement Picking_3_second_board;

    @FindBy(how = How.XPATH, using = "//ul[@id='B']//span[text()=' 4 ']")
    public WebElement Picking_4_second_board;

    @FindBy(how = How.XPATH, using = "//ul[@id='B']//span[text()=' 5 ']")
    public WebElement Picking_5_second_board;

    @FindBy(how = How.XPATH, using = "//ul[@id='B']//span[text()=' 6 ']")
    public WebElement Picking_6_second_board;

    @FindBy(how = How.XPATH, using = "//ul[@id='B']//span[text()=' 7 ']")
    public WebElement Picking_7_second_board;

    @FindBy(how = How.XPATH, using = "//ul[@id='C']//span[text()=' 2 ']")
    public WebElement Picking_2_third_board;

    @FindBy(how = How.XPATH, using = "//ul[@id='C']//span[text()=' 3 ']")
    public WebElement Picking_3_third_board;

    @FindBy(how = How.XPATH, using = "//ul[@id='C']//span[text()=' 4 ']")
    public WebElement Picking_4_third_board;

    @FindBy(how = How.XPATH, using = "//ul[@id='C']//span[text()=' 5 ']")
    public WebElement Picking_5_third_board;

    @FindBy(how = How.XPATH, using = "//ul[@id='C']//span[text()=' 6 ']")
    public WebElement Picking_6_third_board;

    @FindBy(how = How.XPATH, using = "//ul[@id='C']//span[text()=' 7 ']")
    public WebElement Picking_7_third_board;

    @FindBy(how = How.XPATH, using = "//div[@class='add-circle']")
    public WebElement Add_board_circle;

    @FindBy(how = How.XPATH, using = "//*[@aria-label='Powerball']")
    public WebElement Powerball_in_game_page;

    @FindBy(how = How.XPATH, using = "//span[@aria-label='Power Ball 9 of 20']")
    public WebElement Picking_powerball_no9;

    @FindBy(how = How.XPATH, using = "(//span[@aria-label='Power Ball 9 of 20'])[2]")
    public WebElement Picking_powerball_no9_second_pick;

    @FindBy(how = How.XPATH, using = "(//span[@aria-label='Power Ball 9 of 20'])[3]")
    public WebElement Picking_powerball_no9_third_pick;



}
