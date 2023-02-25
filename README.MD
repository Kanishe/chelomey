**[Lesson 2]**(https://disk.yandex.ru/i/Ydu_7UedvZ3NEQ)

[Video](https://disk.yandex.ru/i/WBZi8o8LRrO3KQ)

1. Интерфейсы
2. Объявление интерфейса
3. Реализация интерфейсов
4. Доступ к реализациям через ссылки на интерфейсы
5. Перечисления
6. Конструкторы, методы, переменные экземпляра и перечисления
7. Внутренние и вложенные классы
8. Практическое задание

**[Lesson 3 - Exceptions]**(https://disk.yandex.ru/d/b5aDJXs0_iVSFg)

1. Исключения
2. Блоки операторов try и catch
3. Вывод описания исключения
4. Применение нескольких операторов catch
5. Оператор throw
6. Оператор throws
7. Оператор finally
8. Создание собственных подклассов исключений
9. Многократный перехват исключений
10. Практическое задание

[Lesson 4 Обобщения. Коллекции Часть 1](https://disk.yandex.ru/d/Js0Z8J3tiqjeVw)

1. Небольшая задача
2. Понятие обобщения
3. Обобщённый класс `<T>` с несколькими параметрами типа
4. Ограниченные типы
5. Использование метасимвольных аргументов
6. Ограничения
7. Ограничения на статические члены
8. Ограничения обобщённых исключений
9. Коллекции
10. Класс ArrayList
11. Класс LinkedList
12. Практическое задание
13. Дополнительные материалы
14. Используемая литература
15. Стирание типов [Link-youtube](https://www.youtube.com/watch?v=pgzHglCsTcw)

[Lesson 5 Коллекции Часть 2](https://yadi.sk/i/XE4IOqNwaP7ucw)

1. Коллекции
2. Классы HashМap, LinkedHashMap, TreeMap
3. Классы HashSet, LinkedHashSet, TreeSet
4. Итераторы - [https://disk.yandex.ru/i/EJhsrdIZTy1TEw](https://disk.yandex.ru/i/EJhsrdIZTy1TEw)
5. Интерфейс Comparable
5. Интерфейс Iterator
6. Практическое задание
7. Дополнительные материалы
8. Используемая литература

[Многопоточность Часть 1](https://disk.yandex.ru/d/TCaGduBB3RD04A)

1. Общие сведения
2. Создание потоков
3. Расширение класса [Тhread](https://disk.yandex.ru/i/04GFJ5mK83hwNA)
4. Приоритеты потоков
5. Синхронизация
6. Использование синхронизированных методов
7. Практическое задание
8. Дополнительные материалы
9. Используемая литература

[Многопоточность Часть 2](https://disk.yandex.ru/d/BKuJtoC8fwROgg)

1. ExecutorService

* `execute(Runnable)`
* `submit(Runnable)`
* `submit(Callable)`
* ` invokeAny(...)`
* ` invokeAll(...)`

2. Классы синхронизации
3. Semaphore
4. CountDownLatch
5. CyclicBarrier
6. Lock
7. Практическое задание
8. Дополнительные материалы
9. Используемая литература

[L8 - Stream API](https://disk.yandex.ru/d/ZB96rIaAXjtPRg)

1. Что такое Java Stream API?
2. Способы создания и виды стримов
3. Порядок обработки
4. Почему порядок работы имеет значение?
5. Параллельные стримы

[L9 - Reflection API. JDBC.Основы PostgreSQL](https://disk.yandex.ru/d/Q71Sr_hjwUhCVA)

1. Рефлексия. Общая информация
2. Изучаем классы
3. Аннотации
4. Взаимодействие с базами данных
5. Простые SQL запросы
6. CREATE
7. READ
8. UPDATE
9. DELETE
10. JDBC
11. Установка соединения
12. Запросы в базу
13. Подготовленный запрос и пакетное выполнение запросов
14. Обработка результатов
15. Закрытие ресурсов
16. Транзакции в JDBC
17. Подключение к PostgreSQL
18. Практическое задание
19. Дополнительные материалы
20. Используемая литература

[L10 - PostgreSQL](https://disk.yandex.ru/d/0Czh8UDjfJQAdg)

* `SELECT name, score, round(score / 10, 0) AS new_score FROM students;`
* `OFFSET`
* `LIMIT`
* `SELECT name, score, CASE WHEN score > 80 THEN 'Отлично' WHEN score BETWEEN 60
  AND 79 THEN 'Хорошо' ELSE 'Плохо' END AS result FROM students;`

1. Агрегатные функции

* `GROUP BY`
* `HAVING`

[L11 - Hibernate Part 1](https://disk.yandex.ru/d/SGfcawj2yJU3wA)

1. Hibernate и Java Persistence API (JPA)
2. Понятие сущности и объектно-реляционного отображения
3. Отображения связей
4. Один ко многим
5. Один к одному
6. Многие ко многим

* `Если создаем класс который будет чьимто ID  implements Serializable - см. OrderKey.claas`

    * [Alishev](https://disk.yandex.ru/d/6mKlgRPS4eeCcA)

        * `l6 One to many`
        * `l7 Жизненный цикл сущности в Hibernate`

            * `Transient` (до session.save())

            * `Persistent`(после session.save()  .commit or all methods set on Class .setPassport())

            * `Detached`(detached() или закончена сессия)

            * `Removed` (remove())
        * `l8 какскадирование(сохранени дочерней записи если сохранена родительская)`
            * `cм lesson7HiberCascadingMain`
        * `@OneToMany(mappedBy = "owner",cascade = CascadeType.PERSIST)` - какскадное сохранение работает только с
          аннотацией на Дочернем элементе + методом session.persist(Родитель)
          `@Cascade(org.hibernate.annotations.CascadeType.DELETE)
          @Cascade(org.hibernate.annotations.CascadeType.DETACH)
          @Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE) и тд`
        * [`Разница между persist() и save()`](https://disk.yandex.ru/i/m-J_2ftMrR2Z3g)
        * `L 11 LAZY OR EAGER initialization`
            * `1. @OneToMany - Lazy`
            * `2. @ManyToOne - Eager`
            * `3. @ManyToMany - Lazy`
            * `4. @OneToOne - Eager`
        * `L12 Hibernate+Spring`

[L13 - Spring Core](https://disk.yandex.ru/d/bus65h9LxAmJlw)

1. Что такое Spring?
2. Внедрение зависимостей и инверсия управления
3. Каким образом Spring облегчает разработку?
4. Конфигурирование Spring
5. Конфигурирование с использованием XML
6. Конфигурирование с использованием /аннотаций JavaConf
7. Советы в выборе способа конфигурации
8. Внедрение зависимостей в Spring
9. Внедрение примитивных типов
10. Внедрение объектов
11. Область видимости бинов Э
12. тапы инициализации контекста
13. Этап 1 Этап 2 Этап 3
14. По завершении этапа бины полностью готовы к использованию.
15. Жизненный цикл бина

**Полезное**
[U]

1. [Большой гайд по Optional в Java](https://disk.yandex.ru/i/M0uuIGQZxxrLoQ)
2. [Анонимные классы](https://disk.yandex.ru/i/sutoH4cFwFYWvQ), (Алишев - https://youtu.be/ndnubpPzkNE)
3. [Lambda Expression](https://disk.yandex.ru/i/2qrXN2n-erzcVQ)
   , [Шпаргалка Java программиста 4. Java Stream API](https://disk.yandex.ru/i/8scsBesg7RK7zQ)
4. [Logical Expression `&&`,`||`](https://disk.yandex.ru/i/ER3XjA_9m3LLqw)
5. Builder pattern - [link1](https://disk.yandex.ru/i/wRecd1MR4iJizw)
6. [Final Key word](https://disk.yandex.ru/i/n2H5U0hdc3FarQ) , [Final-Alishev](https://disk.yandex.ru/i/I9ffxqtDD-Gx1A)
   , [Какую проблемму решает final](https://disk.yandex.ru/i/uFu0PTnx1oa-xw)
7. [Documentation](https://disk.yandex.ru/i/UcNsGlKd6sUsRA)
8. [Collection](https://disk.yandex.ru/d/uM7J0igZ31-qTw) / [Ковалевский](https://disk.yandex.ru/d/fsF5_mCIwXQp1g)

![Choosing of data structures](https://disk.yandex.ru/i/7bQw8GcZOkYVEA "Choosing of data structures")

* `HashMap`
* `Iterable`

9. [JDBC]()
10. [Serializable](https://disk.yandex.ru/d/Z5q32gQ086U0xw)
11. [StringBuilder,String Pool](https://disk.yandex.ru/i/wUm2kiJ11ZNkjA), ( https://disk.yandex.ru/i/Pv2_YeOON5LzbA )
12. [RegExp](https://disk.yandex.ru/i/wUm2kiJ11ZNkjA) [link to regexr.com](https://regexr.com/), [Notes about RegExp](https://disk.yandex.ru/d/YnBhprHpdrKp3Q)
13. [ObjectMapper](https://disk.yandex.ru/i/HTivLmttQ_8ElQ), [Jackson](https://disk.yandex.ru/i/9mRzwRCqexEBVA)