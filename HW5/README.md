1. Добавлен формат сохранения через "; ", исходный формат сохранения также можно использовать.
Изменен **Userview.java** добавлен выбор варианта сохранения через ввод 1 или 2.

В **UserController** в методе **saveUser(User user, String saveFormat)** вместо **saveUser(User user)**

В **UserRepository** в методе **create(User user, String saveFormat)** вместо **create(User user)**, также
внес следующие изменения: 

if (saveFormat.equals("1")) {
    for (User u: users) {
        lines.add(mapper.toInput(u));
        }
} else {
    for (User u: users) {
        lines.add(mapper.toInput2(u));
    }
}

В **UserMapper** добавлен метод **toInput2(User user)** который и осуществляет сохранение User с разделителем "; "
также изменил метод **toOutput(String t)**, добавлен разделитель **String[] lines = t.split(",|; ")**, чтоб не возникало проблем при чтении 

2. Добавлена система логирования действий пользователя (CREATE, READ):

В **Userview.java** вызывается **userController.commandLogger("CREATE", newUser)**, который в свою очередь вызывает в классе *FileOperation* метод **saveAll(List<String> data, boolean saveType)**, с параметром *boolean saveType = true*, далее создается файл и в него добавляются логи.