Задача:
=
- Паттерн Фабричный метод реализован в примере с марками автомобилей для решения задачи создания объектов (в данном случае экземпляров автомобилей) без необходимости для клиентского кода знать точный класс, который будет создан. Этот подход уменьшает связанность кода, повышает гибкость, масштабируемость и упрощает сопровождение.

Как это работает:
=
- Интерфейс Car — определяет метод drive
- Конкретные классы автомобилей (Toyota, Ford, BMW) — реализуют интерфейс Car
- Абстрактный класс CarFactory — содержит абстрактный метод createCar, который возвращает объект типа Car
- Конкретные фабрики — каждая фабрика знает, как создать автомобиль определенной марки
- Клиентский код — использует фабрику для создания автомобилей и тестирования их на дороге