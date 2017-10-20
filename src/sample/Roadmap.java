package sample;

import java.util.ArrayList;

/**
 * Created by Fklemke on 04.07.17.
 */
public class Roadmap {

   public Content elm1 = new Content(true,false,"Patienten mit bekannter KHK", AttendingDoc.HAUSARZT,null);

    public Roadmap() {
        //creating the Elements
        this.elm1 = elm1;
        Content elm2 = new Content(true,false,"Anamnese und körperliche Untersuchung, EKG", AttendingDoc.HAUSARZT,elm1);
        Content elm3 = new Content(false,false,"Veränderungen der Symptome oder Befunde Vitien-verdächtiges Herzgeräusch, Hinweis auf Herzinsuffizienz, Q-Zacke im EKG, Komplexe ventrikuläre Arrhythmien, neu auftretetene supraventrikuläre Arrhythmien (bzw. jeweils nach 12 Mon.)", AttendingDoc.HAUSARZT_FACHARZT,elm2);
        Content elm4 = new Content(true,false," Echokardiografie + ggf. Holter-EKG",AttendingDoc.FACHARZT,elm3);
        Content elm5 = new Content(true,false,"EF <40% +nsVT \n*Prüfung EPU ICD-Indikation EF <30% \n*Prüfung ICD-Indikation",AttendingDoc.FACHARZT,elm4);
        Content elm6 = new Content(false,false,"Hochrisiko Patient",AttendingDoc.HAUSARZT_FACHARZT,elm3);
        Content elm7 = new Content(true,true,
                "Risikostratifizierung und ein regelmäßiges Monitoring durch nicht-invasive Verfahren. Ergometrie (niedrige Sensitivität, höhere Sensitivität 5-1", AttendingDoc.FACHARZT,elm6);
        Content elm8 = new Content(false,false,"Vor Beginn eines ja Fitnessprogramms",AttendingDoc.HAUSARZT_FACHARZT,elm7);
        Content elm9 = new Content(true,true,"Keine Indikation für Belastungsuntersuchung",AttendingDoc.HAUSARZT_FACHARZT,elm8);
        Content elm10 = new Content(false,false,"Kontraindikation für eine Stressuntersuchung?",AttendingDoc.HAUSARZT_FACHARZT,elm3);
        Content elm11 = new Content(true,true,"Ggf. Koronar- angiografie (keine Evidenz)",AttendingDoc.INTERVENTIONELLES_ZENTRUM,elm10);
        Content elm12 = new Content(false,false,"WPW-Syndrom, VVI/DDD- Stimulation, kompletter LSB, >1mm ST-Senkungen in Ruhe oder LVH",AttendingDoc.HAUSARZT_FACHARZT,elm10);
        Content elm13 = new Content(true,false,"Bildgebendes Verfahren",AttendingDoc.INTERVENTIONELLES_ZENTRUM,elm12);
        Content elm14 = new Content(false,false,"Ist der Patient körperlich belastbar?",AttendingDoc.HAUSARZT_FACHARZT,elm12);
        Content elm15 = new Content(true,false,"Bildgebendes Verfahren mit pharmakologischer Belastung",AttendingDoc.FACHARZT,elm14);
        Content elm16 = new Content(true,false,"Ergometrie durchführen",AttendingDoc.HAUSARZT_FACHARZT,elm14);
        Content elm17 = new Content(false,false,"Ausbelastet 85% der alterskorrigierten Herzfrequenz?",AttendingDoc.HAUSARZT_FACHARZT,elm16);
        Content elm18 = new Content(false,false,"Auswertung der Ergometrie",AttendingDoc.HAUSARZT_FACHARZT,elm17);
        Content elm19 = new Content(true,true,"Indikation zur LHK-Diagnostik u. ggf. \n*PCI \n*Bypass-OP",AttendingDoc.INTERVENTIONELLES_ZENTRUM,elm18);


        elm1.setNextContent(elm2);
        elm2.setNextContent(elm3);

        //3
        elm3.setYesContent(elm10);
        elm3.setNoContent(elm4);

        elm4.setNextContent(elm5);
        elm5.setNextContent(elm6);

        elm6.setYesContent(elm7);
        elm6.setNoContent(elm8);

        elm8.setYesContent(elm7);
        elm8.setNoContent(elm9);

        elm10.setYesContent(elm11);
        elm10.setNoContent(elm12);

        elm12.setYesContent(elm13);
        elm12.setNoContent(elm14);

        elm13.setNextContent(elm19);
        elm13.setException(true);
        ArrayList<String> arr13 = new ArrayList<>();
        arr13.add("falls pathologisch");

        elm14.setYesContent(elm16);
        elm14.setNoContent(elm15);

        elm15.setNextContent(elm19);
        elm15.setException(true);
        ArrayList<String> arr15 = new ArrayList<>();
        arr15.add("falls pathologisch");
        
        elm16.setNextContent(elm17);

        elm17.setYesContent(elm18);
        elm17.setNoContent(elm15);

        elm18.setYesContent(elm13);
        elm18.setNoContent(elm19);
        elm18.setException(true);
        ArrayList<String> arr18 = new ArrayList<>();
        arr18.add("fraglicher Befund?");
        arr18.add("falls pathologisch");
        elm18.setArrList(arr18);

    }

    public Content getNextElement(){
        return elm1;
    }
}
