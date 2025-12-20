package org.example.learningmanagementsystem.Service;

import org.example.learningmanagementsystem.Model.CollegeFacilities;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class CollegeFacilitiesService {
    ArrayList<CollegeFacilities> facilities = new ArrayList<>();

    // get all
    public ArrayList<CollegeFacilities> getAllFacilities() {
        return facilities;
    }

    // add
    public void addFacility(CollegeFacilities facility) {
        facilities.add(facility);
    }

    // update
    public boolean updateFacility(int roomNumber, CollegeFacilities facility) {
        for (int i = 0; i < facilities.size(); i++) {
            if (facilities.get(i).getFacilityRoomNumber() == roomNumber) {
                facilities.set(i, facility);
                return true;
            }
        }
        return false;
    }

    // delete
    public boolean deleteFacility(int roomNumber) {
        for (int i = 0; i < facilities.size(); i++) {
            if (facilities.get(i).getFacilityRoomNumber() == roomNumber) {
                facilities.remove(i);
                return true;
            }
        }
        return false;
    }

    // get by floor
    public ArrayList<CollegeFacilities> getByFloor(String floor) {

        ArrayList<CollegeFacilities> found = new ArrayList<>();

        for (int i = 0; i < facilities.size(); i++) {
            if (facilities.get(i).getFacilityFloor().equalsIgnoreCase(floor)) {
                found.add(facilities.get(i));
            }
        }

        return found;
    }

    // get by open time
    public ArrayList<CollegeFacilities> getByOpenTime(String openTime) {

        ArrayList<CollegeFacilities> found = new ArrayList<>();

        for (int i = 0; i < facilities.size(); i++) {
            if (facilities.get(i).getFacilityOpenTime().equalsIgnoreCase(openTime)) {
                found.add(facilities.get(i));
            }
        }

        return found;
    }

    // check third floor
    public boolean updateSafetyStairs(int roomNumber) {

        for (int i = 0; i < facilities.size(); i++) {

            if (facilities.get(i).getFacilityRoomNumber() == roomNumber) {

                // if it is on the 3rd floor → enforce safety stairs
                if (facilities.get(i).getIsOnThirdFloor().equalsIgnoreCase("true")) {
                    facilities.get(i).setSafetyStairs("yes");
                }

                return true;
            }
        }

        return false;
    }
}
