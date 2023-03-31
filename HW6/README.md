1. Часть 1.

Сделал User родительским классом, а Persister наследником, теперь можно создавать как User user = new Persister("Bob") так и Persister persister = new Persister("Rob"); методы save(), report() будут работать корректно. 

2. Часть 2.

Внутри UserRepository.java в методе create() создавался User и выбирался его формат сохр.,был нарушен принцип Single Responsibility. 
Выбор формат вынесен в отдельный метод choiseSaveFormat())

В UserView.java разбил Switch-Case так, чтобы внутри каждого Case вызывались методы, которые вынесене отдельно, 
таким образом соблюдаются принципы Single Responsibility и Open-Close.

