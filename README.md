Приложение «Каталог книг»

Описание проекта
Приложение представляет собой каталог книг и состоящее из трех экранов (`Activity`):
1. Главный экран (`MainActivity`): Отображает список книг с использованием `ScrollView` и `GridLayout`, а также содержит кнопку перехода к добавлению новой книги.
2. Экран добавления книги (`NewBookActivity`): Позволяет вводить данные о новой книге через текстовые поля `EditText`.
3. Экран детальной информации (`DetailActivity`): Отображает подробное описание выбранной книги, данные передаются между экранами с помощью `Intent`.

Технические подробности
- Язык разработки: Kotlin
- Компоненты UI: `Activity`, `ScrollView`, `GridLayout`, `LinearLayout`, `Button`, `TextView`, `EditText`
- Передача данных: `Intent` и `putExtra()`
- Отладка: Фиксация жизненного цикла элементов через `Logcat`

Дополнительные файлы
- Логи приложения: Файл `Log.txt` с выгрузкой отладочных логов жизненного цикла находится в корневом каталоге репозитория.
- Готовый APK: Исполняемый файл `app-debug.apk` выложен в разделе Releases (`v1.0`).

Скрины экранов
<img width="344" height="681" alt="Рисунок1" src="https://github.com/user-attachments/assets/112bab0c-235c-44c6-9ceb-fc92cdd5df7f" />
<img width="237" height="470" alt="image" src="https://github.com/user-attachments/assets/1662980f-5a22-4c03-bdbd-4ea4b44840f5" />
<img width="231" height="472" alt="image" src="https://github.com/user-attachments/assets/28dab7f0-0861-4aa5-a13e-b92b2724de48" />

