Функция <string>.capitalize() возвращает строку, заменяя первую букву на заглавную, если это возможно

    println("hello".capitalize())     // Hello
    println("123".capitalize())       // 123
    println("привет!".capitalize())   // Привет!

Функция <string>.decapitalize() возвращает строку, заменяя первую букву на строчную, если это возможно.

    println("Hello".decapitalize())   // hello
    println("Котлин".decapitalize())  // котлин
    println("привет!".decapitalize()) // привет!

Функция <string>.trim() возвращает строку, убирая пробелы в начале и в конце
Функции <string>.trimStart() и <string>.trimEnd() убирают пробелы только в начале и только в конце соответственно.

    println("  Hello  ".trim())   // Hello
    println("  Котлин  ".trim())  // Котлин

contains(other : String, ignoreCase: Boolean):

    "I love kotlin".contains("KOTLIN")       // false
    "I love kotlin".contains("KOTLIN", true) // true
    "приф всем!!! :*******".contains(":*")   //true

contains(char: Char, ignoreCase: Boolean):

    "Hello darkness".contains('D')       // false
    "Hello darkness".contains('D', true) // true
    "приф всем!!! :*".contains('*')      //true

Функция <string>.equals(other: String, ignoreCase: Boolean) проверяет строки на соответствие и возвращает тип Boolean.

    "abcdef".equals("ABCDEF")       // false
    "abcdef".equals("ABCDEF", true) // true
    "hello".equals("hello")         // true

replace(oldChar: Char, newChar: Char, ignoreCase) - возвращает строку, заменяя символ oldChar на символ newChar.

    "12345".replace('1','2')            // 22345
    "Brown bear".replace('b','~',true)  // ~rown ~ear

replace(oldValue: String, newValue: String, ignoreCase) - возвращает строку, заменяя строку oldValue на строку newValue.

    "You are good boy".replace("good","bad") // You are bad boy
    "pa Pa pA PA".replace("pa","hi",true)    // hi hi hi hi

Следующие функции принимают те же параметры, что и функция replace(), но действуют по-другому:

    replaceFirst() - заменяет только первый совпадающий элемент
    replaceBefore() - заменяет всё, что находится перед первым совпадающим элементом
    replaceBeforeLast() - заменяет всё, что находится перед последним совпадающим элементом
    replaceAfter() - заменяет всё, что находится после первого совпадающего элемента
    replaceAfterLast() - заменяет всё, что находится после последнего совпадающего элемента

    //Заменяет все "Pa" на "LOL"
    "Pa Pa".replace("Pa", "LOL") //LOL LOL

    //Заменяет первый "Pa" на "LOL"
    "Pa Pa".replaceFirst("Pa", "LOL") // LOL Pa

    //Заменяет все перед первый "Pa" на "LOL"
    "Pa Pa".replaceBefore("Pa", "LOL") // LOLPa Pa

    //Заменяет все перед последним "Pa" на "LOL"
    "Pa Pa".replaceBeforeLast("Pa","LOL") // LOLPa

    //Заменяет все после первого "Pa" на "LOL
    "Pa Pa".replaceAfter("Pa", "LOL") // PaLOL

    //Заменяет все после последнего "Pa" на "LOL"
    "Pa Pa".replaceAfterLast("Pa", "LOL") // Pa PaLOL

Функция startsWith() вернёт true, если строка начинается с указанной строки/символа.

    "Hello".startsWith("He") // true

Функция endsWith(), соответственно, проверит, оканчивается ли строка на указанное значение.
Аргумент ignoreCase действует так же, как и обычно.

    "Hello".endsWith("lo")   // true
    ("Kotlin".startsWith("KO",true) && "Kotlin".endsWith("TLIN",true)) // true

Функция <string>.reversed() возвращает строку, переворачивая её

    println("hello".reversed())     // olleh
    println("123".reversed())       // 321
    println("привет!".reversed())   // !тевирп