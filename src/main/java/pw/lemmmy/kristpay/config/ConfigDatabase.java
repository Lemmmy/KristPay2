package pw.lemmmy.kristpay.config;

import lombok.Getter;
import ninja.leaping.configurate.objectmapping.Setting;
import ninja.leaping.configurate.objectmapping.serialize.ConfigSerializable;

@ConfigSerializable
@Getter
public class ConfigDatabase {
	@Setting
	private String connectionURI = "jdbc:mysql://localhost/kristpay?user=kristpay&password=";
	
	@Setting
	private int saveInterval = 30;
	
	@Setting
	private int legacyWalletSyncInterval = 600;
}
