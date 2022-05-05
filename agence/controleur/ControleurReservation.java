package controleur;

import modele.Client;
import modele.Vehicule;
import stockage.StockagePersistant;

import java.util.List;

public class ControleurReservation {
    private Client client;
    private Vehicule vehicule;
    private List<Reservation> listeReservation;
    private StockagePersistant stockage;

    public Reservation getReservaation() {
        return reservation;
    }

    public void setReservation(Reservation reservation) {
        this.reservation = reservation;
    }

    public List<Reservation> getListeReservation() {
        return listReservation;
    }

    public void setListeReservation(List<Reservation> listeReservationation) {
        this.listeReservation = listeReservation;
    }

    private void recuperClient(String numeroDossier)
    {
        client = stockage.recupererClient(numeroDossier);
    }

    private void recuperVehicule(String numImmatri)
    {
        vehicule = stockage.recupererVehicule(numImmatri);
    }

    private void terminerVehiculeReservation()
    {
        .getVehicule().setReservation(false);
    }

    private void ReservationVehicule()
    {
        stockage.getVehicule().setReservation(false);
    }

    public void reservationVehicule(String numImmatri, String numeroDossier)
    {
        recuperClient(numeroDossier);
        recuperVehicule(numImmatri);
        vehicule.setReservation(true);
        reservation = new Reservation(client, vehicule);
        client.setReservation(reservation);
    }

}


}
