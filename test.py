from selenium import webdriver

chrome_options = webdriver.ChromeOptions()
chrome_options.add_argument('--headless')
chrome_options.add_argument('--no-sandbox')
driver = webdriver.Chrome(executable_path='/var/jenkins_home/chromedriver', chrome_options=chrome_options)
driver.get("http://localhost:8081/get")
html = driver.find_element_by_tag_name("html")
print(html.get_attribute('innerHTML'))
