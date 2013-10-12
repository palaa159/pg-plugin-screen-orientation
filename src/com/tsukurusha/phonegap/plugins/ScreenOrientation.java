cordova.define("cordova/plugin/screenorientation", function(require, exports, module) {
    var exec = require('cordova/exec');    
    var ScreenOrientation = function() {};    
    ScreenOrientation.prototype.set = function(str, successCallback, errorCallback) {
        exec(successCallback,
    errorCallback,
    'ScreenOrientation',
    'set',
    [str]);
    };        
    var screenorientation = new ScreenOrientation();
    module.exports = screenorientation;
});
