package com.mahasiswa.model;

import java.util.List;
import javax.swing.table.AbstractTableModel;

public class modelTableMahasiswa extends AbstractTableModel { // Extend AbstractTableModel
    private List<modelMahasiswa> mahasiswaList; // Corrected class name to ModelMahasiswa
    private String[] columnNames = {"ID", "NPM", "NAMA", "SEMESTER", "IPK"}; // Corrected variable name

    public modelTableMahasiswa(List<modelMahasiswa> mahasiswaList) {
        this.mahasiswaList = mahasiswaList;
    }

    @Override
    public int getRowCount() {
        return mahasiswaList.size(); 
    }

    @Override
    public int getColumnCount() {
        return columnNames.length; // Fixed to use columnNames
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        modelMahasiswa mahasiswa = mahasiswaList.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return mahasiswa.getId();
            case 1:
                return mahasiswa.getNpm();
            case 2:
                return mahasiswa.getNama();
            case 3:
                return mahasiswa.getSemester();
            case 4:
                return mahasiswa.getIpk();
            default:
                return null;
        }       
    }

    @Override
    public String getColumnName(int column) {
        return columnNames[column]; // Fixed to use columnNames
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false; // Cells are not editable
    }

    public void setMahasiswaList(List<modelMahasiswa> mahasiswaList) {
        this.mahasiswaList = mahasiswaList;
        fireTableDataChanged(); // Notify listeners about data changes
    }
}
