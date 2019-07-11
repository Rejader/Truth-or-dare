package com.theq.einmalrichtig;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.util.Random;

public class Main4Activity extends Activity {

    Button button9;
    Button button10;
    TextView Tv4;

    Random W;

    String[] Warheit = new String[]{"Hast du (heute) schon daran gedacht mit einem aus der Gruppe zu schlafen?",
            "Sex im Freien: Ja oder nein! Und wie am besten.",
            "Hast du schonmal Sexspielzeuge benutzt?",
            "Deine krankest Fantasie?",
            "Wie lange war dein längster Sex? Trinke so viel wie die stunden Anzahl war.",
            "Schon mal über Analsex oder Fisting nach gedacht?",
            "Bist du für oder gegen Abtreibung?",
            "In wen bist du heimlich Verliebt?",
            "Lieber beharrt oder Rasiert unten?",
            "Mit oder ohne Kondom? Erkläre warum.",
            "Womit kann man dich am meisten beeindrucken?",
            "Hast du Erfahrung mit Natursekt?",
            "Welche Straftat hast du schon begangen?",
            "Was ist für dich der größte Abtörner, den es gibt?",
            "Wo war dein erster Kuss?",
            "Wo rasierst du dich überall?",
            "Worauf achtest du bei einer Frau zuerst – Brüste, Hintern oder Gesicht?",
            "Stöhnst du beim Höhepunkt?",
            "Was war dein schlimmster Korb?",
            "Verrate mir ein Geheimnis aus deiner Kindheit.",
            "Guckst du in die Kloschüssel bevor du spülst?",
            "Wie/mit wem war dein erster Kuss?",
            "Hast du in der Vergangenheit schon mal etwas gestohlen?",
            "Pinkelst du unter der Dusche?",
            "Du bist total verliebt, aber dann zieht er/sie sich aus. Was müsste passieren, damit du schreiend davon läufst?",
            "Du ziehst auf eine einsame Insel, wen hier aus der Runde nimmst du mit?",
            "Was ist beim Sex für dich ein absolutes Tabu?",
            "Welches kindische Verhalten hast du heute noch?",
            "Wann hattest du das letzte Mal einen Hang Over?",
            "Wo ist deine erogene Zone?",
            "Was ist dein Lieblings Song?",
            "Wenn du ein Vampir wärst, wen von uns würdest du jetzt beißen?",
            "Wenn du auf den Strich gehen würdest – was wäre deine Spezialität?",
            "Wenn du illegal dein Geld verdienen würdest, womit würdest du es verdienen?",
            "Was war der größte Fehler deines Lebens?",
            "Hast du schon einmal Essen abgeleckt damit es kein anderer mehr isst?",
            "Hast du schonmal Essen vom Boden gegessen?",
            "Hast du schon Kopfschmerzen vorgetäuscht um keinen Sex zu haben?",
            "Hast du einen Lieblingssong oder Lieblingsband, die dir so peinlich ist, dass du noch niemandem davon erzählt hast?",
            "Hast du mal bei einem Test/Klassenarbeit/Klausur geschummelt-?",
            "Hast du mal eine Person des gleichen Geschlechts geküsst? Wenn ja, wen?",
            "Hast du mal einen Liebesbrief verfasst? Wen ja, an wen?",
            "Hast du mal geraucht?",
            "Hast du mal jemandem die Schuld an etwas gegeben, obwohl du Schuld warst?",
            "Schnarchst du?",
            "Wäschst du dir immer die Hände, nachdem du auf dem Klo warst?",
            "Wann hast du dich zuletzt geduscht?",
            "Wann hast du dir zuletzt die Zähne geputzt?",
            "Wann, wo und mit wem hattest du deinen ersten Kuss?",
            "Bist oder warst du mal in einen deiner Lehrer verknallt? Wenn ja, in wen?",
            "Bist oder warst du mal in einen Promi/Star verknallt? Wenn ja, in wen?",
            "Was findest du an dir besonders schön?",
            "Was hast du für „peinliche“ Spitznamen bei deinen Freunden und Familie?",
            "Was ist das dümmste/peinlichste, was du je getan hast?",
            "Was ist dein Lieblingsbuch?",
            "Wer ist oder war dein Lieblingslehrer?",
            "Was ist deine Lieblingsserie?",
            "Was ist deine größte Angst?",
            "Was ist deine schlimmste Macke/schlimmster Tick?",
            "Was magst du an der Person rechts neben dir besonders?",
            "Was war das ekligste, was du jemals gegessen hast?",
            "Wann war dein schlimmster Liebeskummer?",
            "Was war der bisher größte Fehler in deinem Leben?",
            "Was war der Inhalt deines letzten Traumes an den du dich erinnerst?",
            "Was war die schlimmste Bestrafung, die du jemals bekommen hast?",
            "Was würdest du als erstes machen, wenn du mal eine Person des anderen Geschlechts wärst?",
            "Was würdest du gerne mal tun, wenn du unsichtbar wärst?",
            "Welche Person in diesem Raum hat das schönste Gesicht?",
            "Welche Person in diesem Raum hat den schlechtesten Mode-Geschmack?",
            "Welche Person in diesem Raum magst du am meisten?",
            "Welche Person in diesem Raum würdest du am ehesten küssen?",
            "Wen würdest du jetzt gerne küssen?",
            "Wenn du auf eine einsame Insel müsstest, welche 3 Dinge würdest du mitnehmen?",
            "Wenn du dich irgendwohin beamen könntest, wo wärst du jetzt am liebsten?",
            "Wenn du ein Tier wärst, welches Tier wärst du?",
            "Wenn du eine Schönheitsoperation geschenkt bekommst-, was würdest du operieren lassen?",
            "Wenn du einen Wunsch frei hättest, was wäre das?",
            "Wenn du morgen heiraten müsstest, wer wäre es?",
            "Wenn du von einer Person im Raum Gedanken lesen könntest, wer wäre es?",
            "Wenn ich dir 50 Euro geben würde, würdest du die Person rechts neben dir küssen?",
            "Wer aus diesem Raum wird wohl später mal am meisten Geld verdienen?",
            "Wer ist das geilste Mädel, der geilste Typ auf deiner Schule?",
            "Wer ist oder war dein größer Kindheitsheld?",
            "Wer war oder ist deine größte Liebe?",
            "Wie viele verschiedene Personen hast du schon geküsst?",
            "Wie würdest du dein Aussehen auf einer Skala von 1-10 bewerten?",
            "Worauf achtest du beim anderen Geschlecht als erstes?",
            "Hast du schon mal Alkohol getrunken?",
            "Erzähl die peinlichste Story, die dir jemals passiert ist.",
            "Erzähle die peinlichste Geschichte, die dir je bei einem Date passiert ist.",
            "Erzähle ein peinliches Geheimnis aus deiner Kindheit.",
            "Erzähle eine geheime, dunkle Fantasie.",
            "Faltest oder rollst du das Klopapier vor’m Abwischen?",
            "Guckst du vor dem Spülen in die Kloschüssel?",
            "Hast du mal im Schwimmbad ins Wasser gepinkelt?",
            "Hast du schon mal deine Popel gekostet?",
            "Hattest du schon Kontakt zu illegalen Drogen?",
            "Stell dir vor du wärst auf einer einsamen Insel. Welche Person aus diesem Raum würdest du auf keinen Fall mitnehmen?",
            "Welche Eigenschaften findest du am anderen Geschlecht am meisten abturnend?",
            "Welche Person im Raum hat den attraktivsten Körper?",
            "Welcher deiner Mitspieler hat den schönsten Po?",
            "Sortiere alle deine Mitspieler von hübsch nach hässlich.",
            "Hast du schon mal unter der Dusche gepinkelt?",
            "Hast du mal deinen BH bzw. deine Unterhose ausgestopft?",
            "Du musst die nächsten 2 Runden Pflicht nehmen.",
            "Hattest du schon mal einen erotischen Traum mit einer Peson in diesem Raum?",
            "Hattest du schon mal einen One-Night-Stand? Wenn ja, mit wem?",
            "Mit welchem Promi/Star würdest du gerne mal eine Nacht verbringen?",
            "Wann hattest du das letzte Mal Sex?",
            "Wann war dein erstes Mal?",
            "Welche Person aus diesem Raum hast du dir schon mal Nackt vorgestellt?",
            "Welche „Frisur“ trägst du im Intimbereich?",
            "Hast du schon mal deinen Partner betrogen?",
            "Welche Sexstellung gefällt dir am besten?",
            "Hättest du gerne mal Sex mit einer Person des gleichen Geschlechts?",
            "Wie gehst du beim Vorspiel vor?",
            "Was gefällt dir beim Vorspiel am besten?",
            "Wie kann man dich am besten scharf machen?",
            "Woran denkst du, wenn du masturbierst?",
            "Nenne die ungewöhnlichsten Orte, an denen du Sex hattest.",
            "Wie wichtig ist dir Sex in einer Beziehung?",
            "Wie oft denkst du an Sex?",
            "Von wem hattest du deinen letzten erotischen Traum?",
            "Stöhnst du beim Orgasmus?",
            "Mit welchem Mitspieler hättest du gerne Sex?",
            "Magst du Oralsex eher als aktiver oder passiver Part?",
            "Hast du irgendwo Intimpiercings oder Tattoos?",
            "Hast du Erfahrungen mit Analsex?",
            "Bist du mal von jemandem beim Sex oder Masturbieren erwischt worden?",
            "Mit wem hattest du bisher den besten Sex?",
            "Hattest du mal Sex im Freien?",
            "Hattest du mal Sex in einem Fahrzeug?",
            "Hast du Sexspielzeug? Wenn ja, was?",
            "Bist du manchmal ohne Unterwäsche unterwegs?",
            "An welchen Orten hättest du gerne mal Sex?",
            "Warst du mal gleichzeitig mit mehreren Personen in einer Beziehung?",
            "Hattest du schon mal Cyber- oder Telefonsex?",
            "Hattest du mal Sex mit mehr als einer Person gleichzeitig?",
            "Was ist für dich am wichtigsten beim Sex?",
            "Masturbierst du? Wenn ja, wie oft?",
            "Wie viele Mitspieler hast du bereits geküsst?",
            "Mit wie vielen Mitspielern hattest du bereits Sex?",
            "Auf welches Körperteil stehst du beim anderen Geschlecht besonders?",
            "Was ist beim Sex absolut Tabu für dich?",
            "Wer aus dieser Runde denkst du, ist der oder die beste Liebhaber/in?",
            "Schon mal 69 probiert?",
            "Hattest du schonmal deinen eigenen Dealer?",
            "Warst du schonmal in einem Stripclub/Puff?",
            "Warst du schonmal so betrunken das du auf der Straße gepennt hast?",
            "Schonmal den Bullen den Mittelfinger gezeigt?",
            "Schonmal Sex im Krankenhaus gehabt?",
            "Hast du schonmal einen Nackten Arsch geküsst?",
            "Hattest du schonmal Sex an den du dich am nächsten Morgen nicht erinnern konntest?",
            "Willst du versauten, harten Sex?",
            "Hattest du schonmal Sex im Badezimmer?",
            "Hattest du schon 2mal Sex in 2 Stunden?",
            "Hast du schonmal eine 6 geschrieben?",
            "Hattest du schonmal Sex wegen WoP?",
            "Hast du schonml deinen besten Freund/beste Freundin Nackt gesehen?",
            "Hast du schonmal Schnee gegessen?",
            "Hast du schonmal mit komischen Leuten gespielt?",
            "Hast du dieses spiel schonmal mit jmd gespielt auf den du standst?",
            "Bist du schonmal betrunken Auto gefahren?",
            "Hattest du schonmal betrunken Sex mit jmd mit dem du nüchtern nicht geschlafen hättest?",
            "Hast du schonmal etwas von der Arbeit geklaut?",
            "Hast du schonmal einen Porno mit jmd vom anderen Geschlecht geguckt?",
            "Wenn du ein Serien Möder Wärst wie würdest du vorgehen und was wär deine Waffe?",
            "Hast du deine Eltern schon mal belogen?",
            "Was ist das teuerste was du gerade trägst?",
            "Kaufst du bei KIK ein?",
            "Schonmal Sex im Wald gehabt?",};
    boolean TestWahrheit [] = new boolean[171];

    Random P;

    String[] Pflicht = new  String[]{"Trinke eine Body shot von wem du willst. Weigert sich einer Trinkt ihr beide 4 Schlücke.",
            "Errate die Körbchen Größe aller Weiblichen Teilnehmer. Bei jedem Fehler trinkst du 1 shot.",
            "Zähle 5 Songs von einer Band auf, die Gruppe entscheidet welche Band. Für jeden nicht genannten oder Falsch genannten Song trinkst du 1 shot.",
            "Tausche deine Unterwäsche mit einem anderen Spieler deiner Wahl und trage Sie eine Stunde.",
            "Freu dich du darfst allen ab sofort den Drinks servieren. Liebe Gruppe unser neuer Barkipper steht fest.",
            "Lass dir von einem aus der Gruppe den Arsch versohlen, dafür darfst du 10 Schlücke verteilen.",
            "Ex dein Glas oder lass dir ein Glas Wasser über den Kopf schütten.",
            "Such dir einen Buddy! Ihr trinkt jetzt bis du wieder dran warst gemeinsam, außer einer zieht sich für 5 runden aus.",
            "Zieh dich bis auf die Unterwäsche aus für 5 Minuten, dafür verteilst du 10 Schlücke. Traust du dich nicht trinkst du diese.",
            "Gib einem aus der Gruppe einen 30 Sek. Lapdance und trinke dabei dein Glas leer.",
            "Lass einen aus der Gruppe jemanden aus deiner kontaktliste auswählen und ruf diese Person an, stöhne solange bis dieser Person auflegt.",
            "(Zungen)Kuss mit einem des gleichen Geschlechts oder trinke 6 Schlücke.",
            "Strippe für der Gruppe bis auf die Unterwäsche.",
            "Öffne die Hose von einem aus der Gruppe mit dem Mund.",
            "Trinke dein Glas auf ex, Gruppe entscheidet welches mische Verhältnis(10/90 20/80 30/70).",
            "Ziehe jemanden aus der Gruppe das Oberteil möglichst verführerisch aus.",
            "Kopf im Nacken, 7 Schlücke.",
            "Trinke so viel du willst alle müssen mitmachen.",
            "Die Macht ist mit dir! Der Rat hat entschieden ,dass du 6 Schlücke trinken musst und dann die Person Rechts von dir Küssen musst.",
            "Spreche einen Zungenbrecher, bei einem Fehler trinkst du das Glas von deinem Linken Nachbarn leer.",
            "Trinke jedes mal wenn jemand einen Cent in die Mitte wirft 1 Schluck das Geld gehört dir.",
            "Du siehst durstig aus trink mal 3 Schlücke.",
            "Hast du schon mal jemanden in die Friendzone verbannt? wenn ja trinke auf Ex.",
            "Leg dich auf den Schoss von jemanden und sag Meister/ Herrin bestrafe mich( 5 Schläge auf den Arsch).",
            "Mache ein schlüpfriges und Sexy Foto mit einem Mitspieler, desto Versauter desto besser.",
            "Berühre den Intimbereich eines anderen aus der Gruppe.",
            "Stelle dich nur in Unterwäsche in die Kalte Dusche oder trink den Glas leer.",
            "Gib der Person links von dir einen Kuss auf den nackten Po.",
            "Frau: zieh dir den BH aus und bring ihn mir. Mann: zieh dir deine Boxershorts aus und bring sie mir. Diese bleibt 5 Minuten bei mir.",
            "Spreche 2 Runden lang nur Englisch.",
            "Lass dir die Augenbrauen von einem Mitspieler zupfen.",
            "Füttere die Person rechts neben dir mit etwas Leckerem.",
            "Lass dich von der Person rechts schminken. Ihm/ihr werden die Augen verbunden!",
            "Ziehe dein Oberteil aus.",
            "Sprüh Sahne auf deine Brust(Brüste) und lass sie von einem Mitspieler ablecken.",
            "Berühre die Zunge des Gegenübers mit deiner Zunge für zehn Sekunden.",
            "Male dir eine Mono-Braue und poste dann ein Selfie auf Insta. und verlinke alle.",
            "Bestimme einen Mitspieler, der dir in die Hose greifen muss.",
            "Lecke die Brustwarzen von deinem Mitspieler deiner Wahl.",
            "Deinen gegenüber Umarmen.",
            "Greife einer Person deiner Wahl in die Hose.",
            "Trinke 3 Schlücke oder Rülspe jedem voll ins Gesicht.",
            "Bewerte im Style von Dieter Bohlen 2 Runden lang jede Aktion deiner Mitspieler.",
            "Rappe 30 sekunden lang wie dein Lieblingsrapper oder ex.",
            "Rappe eine Strophe über einen Mitspieler.",
            "Streite dich mit deinem 2. Ich.",
            "Du musst die nächsten 2 Runden Pflicht nehmen.",
            "Die anderen Mitspieler dürfen dich 2 Runden lang an einen Stuhl fesseln.",
            "Die Mitspieler dürfen ein Getränk aus allem möglichen Mixen und du musst es trinken",
            "Trinke ein Getränk aus dem Bauchnabel der Person, die dir gegenüber sitzt.",
            "Rufe bei der Maxima-Bar an und frage nach Esmeralda (0591/1627308)",
            "Rufe bei Burgerking an und frage wie lange dein McMenü noch braucht (0591/9154400)",
            "Du bist einsam. Küsse jedesmal jmd bevor du etwas trinkst!",
            "Du bist Batman! Sprich wie er für 2 Runden!",
            "Zähle 5 Sachen auf die kleben, fällt dir nichts mehr ein trinke 8 Schlücke.",
            "Für die nächsten 6 Runden beendest du jeden Satz mit ,Fick mich'.",
            "Erzähle einen witz und bring mindestens 2 Leute zum lachen oder exe dein Glas",
            "Wenn du schon einmal ein Handyspiel gespielt hast, trinke 6 Schlücke! Ps die App zählt ;D.",
            "Sage wie alt die anderen Mitspieler sind für jeden Fehler 3 Schlücke.",
            "Du hast Glück! der Spieler rechts von dir Trinkt 4 Schlücke.",
            "Gemeinschaft! Wer ist am intelligentesten? Derjenige ext!.",
            "So du Alkoholiker... Zähle 5 Alkoholsorten auf! Für jede gibts einen Schluck.",
            "Gemeinschaft, zählt nacheinander ,,Guten Tag auf anderen Sprachen auf.",
            "Zähle 10 Sachen auf die in keinem Jugendzimmer fehlen dürfen! Für jede fehlende Sache 3 Schlücke.",
            "Jede Alkoholverschwendung wird mit 5 Schlücken bestraft! (Pinkeln ist Verschwendung) (für die nächsten 7 Runden).",
            "Der nächste der aufs Klo rennt, ext sein Glas.",
            "Wenn dein Glas halbleer ist, exe und fülle nach.",
            "Singe mit vollem Mund ein Lied, der erste der es errät verteilt 10 Schlücke.",
            "Trinke 6 Schlücke wenn deine Brüste größer sind als die vom Game-master,wenn sie kleiner sind zieh dein Oberteil aus.",
            "Doppelt gemoppelt hält besser! Wenn du schon einmal in einer Prügelei warst, trinke 5 Schlücke. Wenn du sie gewonnen hast, verteile zusätzlich 10 Schlücke.",
            "Verteile 5 Schlücke wenn du an einem graden Tag geburtstag hst, wenn du an einem ungeraden Tag hast, trinke sie.",
            "Lass dir dein Gesicht von deinem rechten Nachbarn ablecken.",
            "Lass dir ein Getränk im Mund mischen + Eiswürfel.",
            "Wenn du das nächste Mal aufs Klo gehst, kehre mit einem Kleidungsstück weniger zurück.",
            "Buchstabiere den Names jedes Mitspielers, samt Nachname, für jeden Fehler  3 Schlücke.",
            "Gib einem Mitspieler einen Eiswürfel mit dem Mund weiter, bei Erfolg trinkt einen Shot zusammen. Bei Misserfolg 2 weil ihr traurig seid. (Verlierer...).",
            "Lass dir die Armhaare mit einer Pinzette entfernen.",
            "Poste ein hässliches Bild von dir auf Instagram mit der Bildunterschrift ich bin hässlich und stolz, lass es für 3h drin.",
            "Trinke weil der Fliegende Holländer es so will dein Glas auf ex.",
            "Der fast Kopflose Nike will das du die Person rechts von dir ableckst.",
            "Gemeinschaft, alle die kein Oberteil an haben, verlieren jetzt auch ihre Hose.",
            "Du bist eine Edelnutte, zieh deine Hose aus.",
            "Du bist ein Tier, vor jeder Runde ein Tiergeräusch machen, wenn du es vergisst, ein Schluck trinken.",
            "Der Game-Master läd zum Trinken ein. Hoch die Glässer.",
            "Singe ein Lied für einen aus der Gruppe.",
            "Trink dein Glas leer und entscheide wer ein Kleidungsstück verliert oder zieh es selber aus.",
            "Du bist hässlich, lass dich verschönern, die Gruppe entscheidet wie.",
            "Dresscode: Alle ziehen etwas aus, der Game-Master entscheidet.",
            "Passt deine Unterwäsche zusammen, dann zieh sie aus.",
            "Geh Alkohl kaufen, ist es aber nicht möglich bezählst du das Frühstück.",};

    boolean TestPflicht[] = new boolean[90];

    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main4);


        button9 = findViewById(R.id.button9);
        button10 = findViewById(R.id.button10);
        Tv4 = findViewById(R.id.TV4);
        W = new Random();
        P = new Random();


        button9.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View view) {

                Tv4.setText(Warheit[W.nextInt(Warheit.length)]);

                int s = W.nextInt(Warheit.length);
                while (TestWahrheit[s] == true) {

                    s = W.nextInt(Warheit.length);

                }

                TestWahrheit[s] = true;

                Tv4.setText(Warheit[s]);

            }},


                    button10.setOnClickListener(new View.OnClickListener() {

                        @Override

                        public void onClick(View v) {

                            Tv4.setText(Pflicht[P.nextInt(Pflicht.length)]);

                            int s = W.nextInt(Pflicht.length);


                            while (TestPflicht[s] == true) {

                                s = W.nextInt(Pflicht.length);

                            }
                            TestPflicht[s] = true;
                        }
                    }
                    )}
    }




