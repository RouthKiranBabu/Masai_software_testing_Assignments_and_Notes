from pathlib import Path 
import os
import time

start_time = time.time()

from selenium import webdriver 
from selenium.webdriver.chrome.service import Service
from selenium.webdriver.chrome.options import Options
from dotenv import load_dotenv
from selenium.webdriver.common.by import By

debugging = True
load_dotenv()

firstname = os.getenv("FIRST_NAME")
lastname = os.getenv("LAST_NAME")
email = os.getenv("EMAIL")
telephone = os.getenv("TELEPHONE")
password = os.getenv("PASSWORD")
passwordconfirm = os.getenv("PASSWORD_CONFIRM")
loginpage = os.getenv("REGISTER_PAGE")

def set_field_to_password(driver, element_id):
    driver.execute_script(f"document.getElementById('{element_id}').type = 'password'")

script_dir = Path(__file__).resolve().parent
driver_path = script_dir.joinpath("chromedriver-win64", "chromedriver.exe")
service = Service(driver_path)

chrome_options = Options()
if debugging:
    chrome_options.add_experimental_option("detach", True)
else:
    chrome_options.add_argument("--headless")

driver = webdriver.Chrome(service = service, options = chrome_options)
driver.get(loginpage)

d_id = {"input-firstname" : firstname,
        "input-lastname": lastname,
        "input-email": email,
        "input-telephone": telephone,
        "input-password": password,
        "input-confirm": passwordconfirm}

def findelement(_id):
    varinput = driver.find_element(By.ID, _id)
    if varinput:
        set_field_to_password(driver, _id)
        varinput.send_keys(d_id[_id])

for val in d_id.keys(): findelement(val)

policy = driver.find_element(By.XPATH, '//input[@type = "checkbox"][@name = "agree"][@value = "1"]')
Continue = driver.find_element(By.XPATH, '//input[@type = "submit"][@value = "Continue"]')

if policy and Continue:
    policy.click()
    Continue.click()
    end_time = time.time()
    print("Register took: {:.2f} seconds.".format(end_time - start_time))
    warning = driver.find_element(By.XPATH, '//div[@class = "alert alert-danger alert-dismissible"]')
    if warning:
        print("User already exists!")

if not debugging:
    driver.quit()