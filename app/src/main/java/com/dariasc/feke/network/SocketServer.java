package com.dariasc.feke.network;

import android.content.Context;
import android.net.nsd.NsdManager;
import android.net.nsd.NsdServiceInfo;

import java.util.List;

public class SocketServer implements FekeServer {

    private Context context;

    NsdManager nsdManager;

    @Override
    public void initialize(Context context) {

    }

    private void registerServce() {
        NsdServiceInfo serviceInfo = new NsdServiceInfo();
        serviceInfo.setServiceName("Feke");
        serviceInfo.setServiceType("_feke._tcp.");
        serviceInfo.setPort(1666);

        nsdManager = (NsdManager) context.getSystemService(Context.NSD_SERVICE);

        nsdManager.registerService(serviceInfo, NsdManager.PROTOCOL_DNS_SD, new FekeNsdListener());
    }

    @Override
    public List<FekeClient> getClients() {
        return null;
    }

    private class FekeNsdListener implements NsdManager.RegistrationListener {

        @Override
        public void onRegistrationFailed(NsdServiceInfo serviceInfo, int errorCode) {

        }

        @Override
        public void onUnregistrationFailed(NsdServiceInfo serviceInfo, int errorCode) {

        }

        @Override
        public void onServiceRegistered(NsdServiceInfo serviceInfo) {

        }

        @Override
        public void onServiceUnregistered(NsdServiceInfo serviceInfo) {

        }
    }

}
