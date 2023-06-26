public class Fibonacci {
    public long getNumber(int position) {
        if (position <= 0) {
            return -1; // Якщо номер позиції недопустимий, повертаємо -1
        } else if (position == 1 || position == 2) {
            return 1; // Базовий випадок: перші два числа Фібоначчі дорівнюють 1
        } else {
            return getNumber(position - 1) + getNumber(position - 2); // Рекурсивно визначаємо число Фібоначчі
        }
    }
}
