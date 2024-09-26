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

email = os.getenv("EMAIL")
password = os.getenv("PASSWORD")
loginpage = os.getenv("LOGIN_PAGE")

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

d_id = {"input-email": email,
        "input-password": password}

def findelement(_id):
    varinput = driver.find_element(By.ID, _id)
    if varinput:
        set_field_to_password(driver, _id)
        varinput.send_keys(d_id[_id])

for val in d_id.keys(): findelement(val)

login = driver.find_element(
    By.XPATH, 
    '//input[@type = "submit"][@value = "Login"][@class = "btn btn-primary"]')

if login:
    login.click()
    end_time = time.time()
    print("Login took: {:.2f} seconds.".format(end_time - start_time))

if not debugging:
    driver.quit()

