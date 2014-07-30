package im.delight.faceless;

/**
 * Copyright (C) 2014 www.delight.im <info@delight.im>
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see {http://www.gnu.org/licenses/}.
 */

public class ConfigExample {
	
	/** Whether demo/preview mode should be enabled or not (must always be <false> before publishing a new release) */
	public static final boolean DEMO_ACTIVE = false;
	/** The base URL (without a trailing slash) to the web API that the client applications will talk to (i.e. the directory that contains the files from Server/public_html) */
	public static final String API_BASE_URL = "https://faceless-api.herokuapp.com";
	/** The prefix of client-side applications' user agents headers that they identify with */
	public static final String CLIENT_VERSION_PREFIX = "Faceless-Android-";
	/** The URL that users are to share if they want to send a link to their friends (e.g. the Google Play URL of the app) */
	public static final String SHARE_URL = "REPLACE_THIS_WITH_VALUE";
	public static final int PASSWORD_LENGTH_FACTOR = 3;
	public static final int UUID_LENGTH_IN_CHARS = 36;
	/** The ROT13-encoded version of <CONFIG_CLIENT_HASH_SEED> from <Server/config.php> */
	public static final String CRYPTO_HASH_SEED_ROT13 = "REPLACE_THIS_WITH_VALUE";
	/** The ROT13-encoded version of <CONFIG_API_SECRET> from <Server/config.php> */
	public static final String CRYPTO_HMAC_KEY_ROT13 = "REPLACE_THIS_WITH_VALUE";
	public static final int CRYPTO_HASH_ITERATIONS = 4;
	/** The support email address that users may get help at */
	public static final String SUPPORT_EMAIL = "info@example.org";
	
	/** This class may not be instantiated */
	private ConfigExample() { }

}
