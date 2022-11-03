public class Main {

    public static void main(String[] args) {
        Pair[] pairs = new Pair[]{
                new Pair("222", "jhjjdh"),
                new Pair("277", "jfljjjjjjjj")};
        try {
            var o = getArr(pairs);
            for (int i = 0; i < o.length; i++) {
                System.out.println(o[i]);
            }
        } catch (IllegalArgumentException | UnsupportedOperationException e) {
            throw new RuntimeException(e);
        }

    }

    static String[] getArr(Pair[] pairs) {
        var newArr = new String[pairs.length];
        for (int i = 0; i < newArr.length; i++) {
            newArr[i] = String.format("\"%s\" %s", pairs[i].getTitle(), pairs[i].getName());
        }
        return newArr;
    }
}

/**
 * 1/Дан массив пар названий книг и авторов, необходимо
 * привести каждую пару в строку вида: «Название книги» И. О. Автора.
 * 2/Напишите пример обработки нескольких исключений в одном блоке catch.
 */