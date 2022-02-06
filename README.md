# Проект и автотесты разработаны для [Demo Web Shop](http://demowebshop.tricentis.com)

## Технологии и инструменты

<p  align="center">

<code><img width="5%" title="Java" src="images/logo/java-logo.svg"></code>
<code><img width="5%" title="Gradle" src="images/logo/gradle-logo.svg "></code>
<code><img width="5%" title="JUnit5" src="images/logo/junit5-logo.svg"></code>
<code><img width="5%" title="Selenide" src="images/logo/selenide-logo.svg"></code>
<code><img width="5%" title="REST-Assured" src="images/logo/rest-assured-logo.svg"></code>
<code><img width="5%" title="Jenkins" src="images/logo/jenkins-logo.svg"></code>
<code><img width="5%" title="Selenoid" src="images/logo/selenoid-logo.svg"></code>
<code><img width="5%" title="Allure TestOps" src="images/logo/allure-testops-logo.svg"></code>
<code><img width="5%" title="Allure Report" src="images/logo/allure-report-logo.svg"></code>
<code><img width="5%" title="Jira" src="images/logo/jira-logo.svg"></code>
<code><img width="5%" title="Telegram" src="images/logo/telegram-logo.svg"></code>
</p>

* [Java](https://www.oracle.com/java/) - для написания тестов  
* [Gradle](https://gradle.org) - для сборки проекта
* [JUnit 5](https://junit.org/junit5/) - для запуска тестов
* [Selenide](https://selenide.org) - для тестирования UI
* [REST-Assured](https://rest-assured.io) - для тестирования API
* [Jenkins](https://www.jenkins.io/) - для обеспечения процесса непрерывной интеграции
* [Selenoid](https://aerokube.com/selenoid/) - для запуска UI тестов в [Docker containers](https://www.docker.com/resources/what-container)
* [Jira](https://www.atlassian.com/software/jira) - для отслеживания задач
* [Allure TestOps](https://docs.qameta.io/allure-testops/) и [Allure Report](http://allure.qatools.ru) - для управления тестами, анализа их прохождения и оформления отчетности
* [Telegram Bot](https://core.telegram.org/bots) - для оповещения о прохождении тестов

## Запуск и прохождение тестов:

### Команда для локального запуска тестов:

```
gradle clean test 
```
### Для удаленного запуска тестов воспользуйтесь [Jenkins](https://jenkins.autotests.cloud/job/09_sprokaev_Web-UI_API/build?delay=0sec)
![Jenkins](./images/jenkins.png)

### Видео-отчет о прохождении теста из Selenoid:
![Selenoid](./images/video.gif)

### Результаты прохождения тестов в [Allure Report](https://jenkins.autotests.cloud/job/09_sprokaev_Web-UI_API/27/allure/)
![Allure1](./images/Allure-Report.png)

### Результаты прохождения тестов в Allure TestOps
![Allure2](./images/Allure-TestOps.png)

### Результаты прохождения тестов в Jira
![Allure2](./images/Jira.png)

### Уведомление о прохождении тестов в Telegram
![Allure2](./images/Telegram-notification.png)
