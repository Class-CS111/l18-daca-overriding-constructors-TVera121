import java.util.Set;

/**
 * Represents one person receiving deferred action for childhood arrivals (DACA).
 * 
 * < @author Tony Vera>
 *
 * @version 1.2
 **/

//TODO: Complete UML class diagram

/* UML CLASS DIAGRAM:
-----------------------------------------
					DACArecipient
-----------------------------------------
- surname : String
- givenName : String
- uscisNumber : String
- countryOfOrigin : String
- birthday : int
- validFromDate : int
- expirationDate : int
- sex : char
-----------------------------------------
+ DACArecipient()
+ DACArecipient(surname:String, givenName:String, uscisNumber:String, countryOfOrigin:String, birthday:int, validFromDate:int, expirationDate:int,sex:char)
+ getSurname() : String
+ getGivenName() : String
+ getUscisNumber() : String
+ getCountyOfOrigin() : String
+ getBirthDay() : int
+ getValidFromDate() : int
+ getExpirationDate() : int
+ getSex() : char
+ setSurname(surname : String) : void
+ setGivenName(givenName : String) : void
+ setUscisNumber(uscisNumber : String) : void
+ setCountryOfOrigin(countryOfOrigin : String) : void
+ setBirthday(birthday : int) : void
+ setValidFromDate(validFromDate : int) : void
+ setExpirationDate(expirationDate : int) : void
+ setSex(sex : char) : void
+ setAll(surname:String, givenName:String, uscisNumber:String, countryOfOrigin:String, birthday:int, validFromDate:int, expirationDate:int,sex:char) : void
+ toString() : String
+ equals(other : DACArecipient) : boolean
+ printCard() : void
+ jdnToDate(J : int) : String
-----------------------------------------
*/

public class DACArecipient
{
	/***** INSTANCE VARIABLES *****/
  private String surname;
  private String givenName;
  private String uscisNumber;
  private String countryOfOrigin;
  private int birthday, validFromDate, expirationDate;
  private char sex;
	

	/****** CONSTANTS ******/
  private static final 
	String ASCII_ART_0 ="    .----.    .----.  ",
        ASCII_ART_1 = "   (  --  \\  /  --  )",
        ASCII_ART_2 = "          |  |        ",
        ASCII_ART_3 = "         _/  \\_      ",
        ASCII_ART_4 = "        (_    _)      ",
        ASCII_ART_5 = "     ,    `--`    ,   ",
        ASCII_ART_6 = "     \\'-.______.-'/  ",
        ASCII_ART_7 = "      \\          /   ",
        ASCII_ART_8 = "       '.--..--.'     ",
        ASCII_ART_9 = "         `\"\"\"\"\"` ",
        ASCII_CREDIT ="   ascii art by: jgs    ";
	private static final String TITLE_USA = "UNITED STATES OF AMERICA",
				TITLE_EAC = "EMPLOYMENT AUTHORIZATION CARD";
	private static final String LABEL_SURNAME = "SURNAME", 
				LABEL_GIVEN_NAME = "GIVEN NAME", LABEL_USCIS_NUM = "USCIS#",
				LABEL_BIRTH_COUNTRY = "COUNTRY OF BIRTH",
				LABEL_BIRTH_DATE = "DATE OF BIRTH",
				LABEL_SEX = "SEX", LABEL_VALID_DATE = "VALID FROM:", LABEL_EXPIRE_DATE = "CARD EXPIRES:",
				LABEL_REENTRY_DISCLAIMER = "NOT VALID FOR REENTRY TO U.S.";

  public static final String DEFAULT_SURNAME = "Unknown";
  public static final String DEFAULT_GIVENNAME = "Unknown";
  public static final String DEFAULT_USCISNUMBER = "Unknown";
  public static final String DEFAULT_COUNTRYOFORIGIN = "Unknown";
  public static final int DEFAULT_BIRTHDAY = 2415021;
  public static final int DEAULT_VALIDFROMDATE = 2415021;
  public static final int DEFAULT_EXPIRATIONDATE = 2415021;
  public static final char DEFAULT_SEX = 'X';

	/***** ACCESSORS *****/
	//Write the getter for each instance variable. Remember to include documentation for each method.

	/**
	* Returns surname of calling object
	* 
	* @return String representing surname
	*/
	public String getSurname()
	{
		return this.surname;
	}
	/**
	* Returns given name of calling object
	* 
	* @return String representing givenName
	*/
	public String getGivenName()
	{
		return this.givenName;
	}
	/**
	* Returns USCIS Number of calling object
	* 
	* @return String representing uscisnumber
	*/
	public String getUscisNumber()
	{
		return this.uscisNumber;
	}
	/**
	* Returns country of origin of calling object
	* 
	* @return String representing countryOfOrigin
	*/
	public String getCountryOfOrigin()
	{
		return this.countryOfOrigin;
	}
	/**
	* Returns birthday of calling object
	* 
	* @return int representing birthday in Julian Date Number
	*/
	public int getBirthday()
	{
		return this.birthday;
	}
	/**
	* Returns Valid from date of calling object
	* 
	* @return int representing validFromDate in Julian Date Number
	*/
	public int getValidFromDate()
	{
		return this.validFromDate;
	}
	/**
	* Returns expiration date of calling object
	* 
	* @return int representing expirationDate in Julian Date Number
	*/
	public int getExpirationDate()
	{
		return this.expirationDate;
	}
	/**
	* Returns gender of calling object
	* 
	* @return char representing sex
	*/
	public char getSex()
	{
		return this.sex;
	}


	/***** MUTATORS *****/
	/**
	* Sets surname to parameter value of calling object
	* 
	* @param surname String representing last name
	*/
	public void setSurname(String surname)
	{
		this.surname = surname;
	}
	/**
	* Sets givenName to parameter value of calling object
	* 
	* @param surname String representing first name
	*/
	public void setGivenName(String givenName)
	{
		this.givenName = givenName;
	}
	/**
	* Sets uscisNumber to parameter value of calling object
	* 
	* @param uscisNumber String representing uscis number
	*/
	public void setUscisNumber(String uscisNumber)
	{
		this.uscisNumber = uscisNumber;
	}
	/**
	* Sets countryOfOrgin to parameter value of calling object
	* 
	* @param countryOfOrigin String representing the country of orgin
	*/
	public void setCountryOfOrigin(String countryOfOrigin)
	{
		this.countryOfOrigin = countryOfOrigin;
	}
	/**
	* Sets birthday to parameter value of calling object
	* 
	* @param birthday int representing the Julian date of birth
	*/
	public void setBirthday(int birthday)
	{
		this.birthday = birthday;
	}
	/**
	* Sets validFromDate to parameter value of calling object
	* 
	* @param validFromDate int representing the Julian date of validation
	*/
	public void setValidFromDate(int validFromDate)
	{
		this.validFromDate = validFromDate;
	}
	/**
	* Sets expirationDare to parameter value of calling object
	* 
	* @param  expirationDate int representing the Julian date of experation
	*/
	public void setExpirationDate(int expirationDate)
	{
		this.expirationDate = expirationDate;
	}
	/**
	* Sets sex to parameter value of calling object
	* 
	* @param  sex char representing the gender
	*/
	public void setSex(char sex)
	{
		this.sex = sex;
	}

	//Write the setAll method. Remember to include documentation.

	/**
	* Sets all parameters values of calling object 
	* @param surname String representing last name
	* @param surname String representing first name
	* @param uscisNumber String representing uscis number
	* @param countryOfOrigin String representing the country of origin
	* @param birthday int representing the Julian date of birth
	* @param validFromDate int representing the Julian date of validation
	* @param  expirationDate int representing the Julian date of experation
	* @param  sex char representing the gender
	*/
    
  	/**DESCRIPTION: Assigns parameters to corresponding instance variables of calling DACArecipient. */
	public void setAll(String surname, String givenName, String uscisNumber, 
	String countryOfOrigin, int birthday, int validFromDate, int expirationDate, char sex)
	{
		this.surname = surname;
		this.givenName = givenName;
		this.uscisNumber = uscisNumber;
		this.countryOfOrigin = countryOfOrigin;
		this.birthday = birthday;
		this.validFromDate = validFromDate;
		this.expirationDate = expirationDate;
		this.sex = sex;
	}
	
	/**** CONSTRUCTORS ****/

  	/**
 	* Default (no argument) constructor, uses DEFAULT constants defined in this class
	*/
	public DACArecipient()
	{
    	this.setAll(DEFAULT_SURNAME, DEFAULT_GIVENNAME, DEFAULT_USCISNUMBER, DEFAULT_COUNTRYOFORIGIN,
      		DEFAULT_BIRTHDAY, DEAULT_VALIDFROMDATE, DEFAULT_EXPIRATIONDATE,DEFAULT_SEX);
	}

	/**
	 * Full constructor, takes arguments for all instance variables
	 *
	 * @param surname last name of DACArecipient
	 * @param givenName first name of DACArecipient
	 * @param uscisNumber number of DACArecipient
	 * @param countryOfOrigin country of birth of DACArecipient
	 * @param birthday date of birth of DACArecipient
	 * @param validFromDate validation issue date of DACArecipient
	 * @param expirationDate date of expiratoin of DACArecipient
	 * @param sex gender of DACArecipient
	*/
	public DACArecipient(String surname, String givenName, String uscisNumber, 
			String countryOfOrigin, int birthday, int validFromDate, int expirationDate, char sex)
	{
		this.setAll(surname, givenName, uscisNumber, countryOfOrigin,
      		birthday, validFromDate, expirationDate, sex);
	}
	/***** OTHER REQUIRED METHODS *****/

	/**
	*Return a string of all 8 parameters of DACArecipient seperated by commas and spaces
	*
	*@return String of all Paramaters
	*/ 

	public String toString()
	{
		return String.format("%s, %s, %s, %s, %d, %d, %d, %c", surname, givenName, 
							uscisNumber, countryOfOrigin, birthday, validFromDate, expirationDate, sex);
	}

	/**
	 * Method that compares the instant variables of the calling DACArecipient
	 * with those of the parameters.  If ALL are the same the return is True, 
	 * otherwise return value is False
	 * 
	 * @param DACArecipient parameters
	 * @return boolean result
	 */
	public boolean equals(DACArecipient other)
	{
		return this.surname.equals(other.surname) &&
				this.givenName.equals(other.givenName) &&
				this.uscisNumber.equals(other.uscisNumber) &&
				this.countryOfOrigin.equals(other.countryOfOrigin) &&
				this.birthday == other.birthday &&
				this.validFromDate == other.validFromDate &&
				this.expirationDate == other.expirationDate &&
				this.sex == other.sex;
	}
 
  
  	/** DESCRIPTION: Prints to the console the Employment Authorization Card using the calling DACArecipient's instance variables.*/
  	public String printCard()
  	{
		String card;
		
    	card =  String.format("╔══════════════════════════════════════════════════════════════════════╗%n");
		card += String.format("║%35s%35s║%n", TITLE_USA, "");
		card += String.format("║%60s%10s║%n", TITLE_EAC, "");
		card += String.format("║%-25s%-45s║%n", "", LABEL_SURNAME);
		card += String.format("║%-25s%-45s║%n", ASCII_ART_0, surname);
		card += String.format("║%-25s%-45s║%n", ASCII_ART_1, LABEL_GIVEN_NAME);
		card += String.format("║%-25s%-45s║%n", ASCII_ART_2, givenName);
		card += String.format("║%-25s%-45s║%n", ASCII_ART_3, LABEL_USCIS_NUM);
		card += String.format("║%-25s%-45s║%n", ASCII_ART_4, uscisNumber);
		card += String.format("║%-25s%-45s║%n", ASCII_ART_5, LABEL_BIRTH_COUNTRY);
		card += String.format("║%-25s%-45s║%n", ASCII_ART_6, countryOfOrigin);
		card += String.format("║%-25s%-15s%-30s║%n", ASCII_ART_7, LABEL_BIRTH_DATE, LABEL_SEX);
		card += String.format("║%-25s%-15s%-30s║%n", ASCII_ART_8, jdnToDate(birthday), sex);
		card += String.format("║%-25s%-15s%-30s║%n", ASCII_ART_9, LABEL_VALID_DATE, jdnToDate(validFromDate));
		card += String.format("║%-25s%-15s%-30s║%n", "", LABEL_EXPIRE_DATE, jdnToDate(expirationDate));
		card += String.format("║%-25s%-45s║%n", ASCII_CREDIT, LABEL_REENTRY_DISCLAIMER);
		card += String.format("╚══════════════════════════════════════════════════════════════════════╝%n");
		return card;
  }

	/**DESCRIPTION: Converts a Julian Day Number to Julian calendar date formatted as MM/DD/YYYY using algorithm adapted from https://en.wikipedia.org/wiki/Julian_day.*/
  	public static String jdnToDate(int J)
	{
		int B, C, e, f, g, h, D, M, Y;
		
		B=274277;
		C=-38;
		f=J + 1401 + (((4*J+B)/146097)*3)/4+C;
		e=4*f+3;
		g=(e%1461)/4;
		h=5*g+2;
		D=((h%153)/5)+1;
		M=((h/153)+2)%12+1;
		Y=(e/1461)-4716+(12+2-M)/12;

		return String.format("%02d/%02d/%04d",M,D,Y);
	}
  /*
  public String toString()
  {
    return "Surname: " + surname + ", Given Name: " + givenName + ", USCIS Number: " + uscisNumber + ", Country of Origin: " + countryOfOrigin + ", Birthday: " + birthday + ", Valid From Date: " + validFromDate + ", Expiration Date: " + expirationDate + ", Sex: " + sex;
  }*/
}