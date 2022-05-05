package controleur;

import modele.Client;
import modele.Location;
import modele.Vehicule;
import stockage.StockagePersistantClient;
import stockage.StockagePersistantLocation;
import stockage.StockagePersistantVehicule;

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
        client = persistant.recupererClient(numeroDossier);
    }

    private void recuperVehicule(String numImmatri)
    {
        vehicule = persistant.recupererVehicule(numImmatri);
    }

    private void terminerVehiculeReservation()
    {
        reservation.getVehicule().setReservation(false);
    }

    private void ReservationVehicule()
    {
        reservation.getVehicule().setReservation(false);
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
