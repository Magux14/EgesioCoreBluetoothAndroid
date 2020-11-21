var exec = require('cordova/exec');

module.exports.startMainProcess = function (arg0, success, error) {
    exec(success, error, 'EgesioCoreBluetoothAndroid', 'startMainProcess', [arg0]);
};

module.exports.getConnectionStatus = function (arg0, success, error) {
    exec(success, error, 'EgesioCoreBluetoothAndroid', 'getConnectionStatus', [arg0]);
};

module.exports.disconnectPeripheral = function (arg0, success, error) {
    exec(success, error, 'EgesioCoreBluetoothAndroid', 'disconnectPeripheral', [arg0]);
};

module.exports.getCurrentMeasurement = function (arg0, success, error) {
    exec(success, error, 'EgesioCoreBluetoothAndroid', 'getCurrentMeasurement', [arg0]);
};

module.exports.startContactTracing = function (arg0, success, error) {
    exec(success, error, 'EgesioCoreBluetoothAndroid', 'startContactTracing', [arg0]);
};

module.exports.stopContactTracing = function (arg0, success, error) {
    exec(success, error, 'EgesioCoreBluetoothAndroid', 'stopContactTracing', [arg0]);
};