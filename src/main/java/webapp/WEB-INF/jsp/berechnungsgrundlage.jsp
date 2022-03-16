<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="css/default.css">

    <title>Startseite</title>
</head>
<body>

    <h1>Das ist die Startseite</h1>


    <svg width="400" height="20" style="display:block; margin:auto">
        <rect width="400" height="10" style="fill:rgb(0,0,255);stroke-width:10;stroke:rgb(0,0,0)" />
    </svg>


    <div class="Aussen">

        <div class="Eingabe">
            <p>Anfangskapital in Euro</p>
            <input id="anfangskapital" value="5000" style="width:100%">
            <p>Monatliche Sparrate in Euro</p>
            <input id="sparrate" value="100" style="width:100%">
            <p>Spardauer in Jahren</p>
            <input id="spardauer" value="10" style="width:100%">
            <p>Jährlicher Zinssatz in Prozent</p>
            <input id="zinsssatz" value="2" style="width:100%">

            <p>Ausschüttungsintervall</p>
            <select id="select1">
                <option value="w">Wöchentlich</option>
                <option value="m">Monatlich</option>
                <option value="q">Quartalsweise</option>
                <option value="j">Jährlich</option>
            </select>



            <p></p>
            <br>

            <button class="berechnung">
                <p>Berechnen</p>
            </button>

        </div>



        <div class="Ausgabe">








        </div>

        <br>


        <p> Der Wert der ausgewählten Option ist: <span class="output"> </span></p>
        <button onclick="getOption()"> Prüfe Wert </button>

        <br>

        <a href="/hello">halloseite</a>

        <br>
        <a href="/normal.html">normalseite</a>
        <br>

    </div>



    <script type="text/javascript">
        function getOption() {
            selectElement = document.querySelector('#select1');
            output = selectElement.value;
            document.querySelector('.output').textContent = output;
        }
    </script>

</body>
</html>