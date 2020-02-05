<html>
    <head>
        <title>DizionarioBeansSaulle</title>           <!--pagina iniziale del dizionario.-->
    </head>
    <body>
        <h1>Benvenuto nel dizionario, Cosa vuoi fare?</h1>
        <form action="Add.jsp" method="POST">
        Parola : <input type="text" name="parola">
        Significato : <input type="text" name="significato">
            <button type="submit">Aggiungi</button>
        </form>
        <form action="Delete.jsp" method="POST">
            Parola : <input type="text" name="parola">
            <button type="submit">Cancella</button>
        </form>
        <form action="Update.jsp" method="POST">
            Parola : <input type="text" name="parola">
            Significato : <input type="text" name="significato">
            <button type="submit">Modifica</button>
        </form>
        <form action="Find.jsp" method="POST">
            Parola : <input type="text" name="parola">
            <button type="submit">Cerca</button>
        </form>
    </body>
</html>