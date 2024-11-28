package NewPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Class_01 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		String xpath1 = "[placeholder='Search for Products, Brands and More']";
		driver.findElement(By.cssSelector(xpath1)).sendKeys("Proteins");
		String xpath2 = "[class='_2j7a4R']";
		String text = driver.findElement(By.cssSelector(xpath2)).getText();
		System.out.println(text);
		Thread.sleep(3000);
		driver.close();
	}

}
/*Top Stories :Brand Directory
MOST SEARCHED FOR ON FLIPKART:iPhone 16iPhone 16 PlusiPhone 16 ProiPhone 16 Pro MaxWhoop BandOPPO Find X8Flipkart MinutesFlipkart ExchangeFlipkart ResetNothing Phone 2a PlusSareesCMF by Nothing Phone 1Pocket BazaarXiaomi 14 CIVIInfinix Note 40 Pro 5GiPhone 15Infinix Note 40 5GiPhone 15 Plusvivo X Fold3 ProMotorola g04sVivo x 100OnePlus Nord CE 3 Lite 5GSpoyl StoreSAMSUNG Flip5SAMSUNG Fold5Flipkart Axis Bank Super Elite Credit card5G Mobile PhonesPrimebook LaptopsMoto Edge 40Grievance RedressalOPPO Reno7 Pro 5GHelp CentreTrack OrdersManage OrdersReturn OrdersGift Cards StoreFlipkart Axis Bank Credit CardPay Later
MOBILESOPPO Reno 12Motorola Edge 50 FusionREDMI 12 5GREDMI Note 13 5GRealme 12+ 5GPOCO C65Motorola G84Realme C53Infinix Smart 8Samsung Galaxy S23 5GSamsung Galaxy S21 FE 5G Qualcommvivo V30Samsung Galaxy S24 5GSamsung Galaxy S24+ 5GiPhone 12 64GBiPhone 12 Pro 512GBiPhone 12 128GBVivo Y15SAMSUNG Galaxy S21 FE 5GInfinix HOT 30iRealme 10 Pro 5GMOTOROLA G62 5GNothing PhoneREDMI Note 12 Pro 5GInfinix SMART 7Vivo Y12Oppo A12Motorola 5g PhoneRealme 5g SmartphoneApple 5g PhoneIqoo 5g PhonesOneplus 5g PhonesVivo 5g PhonesOppo 5g Smart PhonesOppo F15Oppo A31Samsung A71Samsung A51Samsung A314G MobileNokia MobileSamsung MobileiphoneOppo MobileVivo Mobile
CAMERAGoPro Action CameraNikon CameraCanon CameraSony CameraCanon DSLRNikon DSLR
LAPTOPSAsus ROG AllyMacBook Pro M2Premium LaptopASUS ROG Strix SCAR 16 (2023) Core i9 13th GenASUS ROG Zephyrus M16 (2023) Core i9 13th GenASUS Zenbook 14 OLED (2022)Realme Book Prime Core i5 11th GenMicrosoft Surface Go Pentium 128GBApple LaptopsAcer LaptopsLenovo LaptopsDell LaptopsAsus LaptopsHP LaptopsGaming Laptops2 in 1 LaptopsLaptopsDell latest laptops 2022HP latest laptops 2022Infinix INBook Y1 PlusSAMSUNG Galaxy Book312th Gen Intel Core Laptops
TVSNokia TVPanasonic TVThomson TVMi X ProRealme TVMotorola TVOnePlus TVsLG TVTVSony TVSamsung TVAndroid TelevisionIffalcon TvMi TV
LARGE APPLIANCES:TelevisionWashing MachinesRefrigeratorsAir ConditionersElectric CookersElectric Jug(Heater) / Travel KettlesInduction CooktopsInverters / stabilizerIrons / Iron BoxMixer Grinder JuicerWet GrindersChimneysMicrowave OvensVacuum CleanersWater PurifierFan
CLOTHINGSareesGreen bridal lehengaTopsApron for DoctorsShoesSunglassesBridal BlouseHalf saree blouse designsDesigner blousesBlouse designsShirtsCotton saree blouse designsTshirtsJeansDressesOne piecesGroom wedding sherwaniDesigner Salwar SuitsBraCotton simple blouse designsBanarasi saree blouse designsStylish blouse astin designTrack PantBlouse neck designsKurtasParty DressesPalazzo SuitsAnarkaliGownsCut out dressSalwar SuitsKurtisDesigner SareesLeggingsShortsGeorgette SareesEthnic Wearuppada pattu sareesBlouse back designJodhpur pants
FOOTWEAR:Adidas ShoesReebok ShoesNike ShoesPuma ShoesBootsBata ShoesWoodland ShoesSkechers ShoesSneakersWomens BootsSports ShoesLoafersSandalsLotto Sports ShoesCasual ShoesWomens Skechers ShoesAsics Sports ShoesFormal ShoesSchool Shoes
GROCERIESPhonePe Grocery VoucherHand WashSoapCashew NutsSunflower OilEggsToilet CleanerHarpic Toilet CleanerDettol SoapMustard OilBiscuitsCheesePatanjali AttaFortune OilAashirvaad AttaTea
BEST SELLING ON FLIPKARTHeadphonesBest Gas GeyserKitchen GeyserNutri BlendersPortable Air CoolerBest Air CoolerBagsHitachi Refrigerator 3 DoorBooksToysCandlesHelmetsWall ClocksBaby FoodChocolatesCyclesCalculatorsLipsticksMaskVertiv UPSFastrack WatchesWalletsEarringsGold CoinsRealme Pad MiniHandbagsconekt SW2 SmartwatchMivi DuoPods a350Speaker Cleaner
FURNITUREFurnitureSofasBedsDining setsWardrobesMattressesTV UnitsTablesChairsShelvesBean BagsOffice ChairsComputer TableOffice TablesRed SofaWakefit BedsWhite SofaWakefit MattressGreen SofaBlack SofaBrown Sofa
BGMH:ShampooWhey ProteinHomeopathyCricketCyclesFootballsTreadmillsChristmas GiftsFitness AccessoriesOnline GuitarBooks StoreMusical Instrument StoreDabur ChyawanprashBaidyanath ChyawanprashEnergy DrinksToysMilk Drink MixesChyawanprashIndian FlagProtein Supplements
*/