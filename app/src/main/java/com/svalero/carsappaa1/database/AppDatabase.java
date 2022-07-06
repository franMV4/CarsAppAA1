package com.svalero.carsappaa1.database;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.svalero.carsappaa1.dao.CarDao;
import com.svalero.carsappaa1.dao.ClientDao;
import com.svalero.carsappaa1.dao.OrderDao;
import com.svalero.carsappaa1.domain.Car;
import com.svalero.carsappaa1.domain.Client;
import com.svalero.carsappaa1.domain.Order;

@Database(entities = {Car.class, Client.class, Order.class}, version = 1, exportSchema = false)
public abstract class AppDatabase extends RoomDatabase {


    public abstract CarDao carDao();

    public abstract ClientDao clientDao();

    public abstract OrderDao orderDao();


}
